package com.example.study.controller;

import com.example.study.mapper.CatMapper;
import com.example.study.model.Cat;
import com.example.study.model.SubmitUserForm;
import com.example.study.model.UserModel;
import com.example.study.service.CatService;
import com.fasterxml.jackson.core.JsonParseException;
import lombok.Setter;
import org.apache.catalina.User;
import org.elasticsearch.common.inject.internal.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//必须加上的
@RestController
public class TestController {

    // 1.增加set函数之后会自动给成员属性增加一个setUserService函数
    // 2.当增加autowired属性之后,会自动按照类型自动装配参数值 - 也就是自动 new UserService()然后赋值给它
    @Setter(onMethod_ = @Autowired)
    private CatService userService;

    @Autowired
    private CatMapper catMapper;

    @GetMapping("/userList")
    public List<UserModel> users() {
    // 创建一个泛型List对象
        List<UserModel> userList = new ArrayList<UserModel>();
        UserModel a = new UserModel();
        // 增加了@data-lombok的注解之后,提供了成员方法
        a.setId(123);
        a.setName("jack");
        userList.add(a);
        System.out.println(userList);
        // 可以直接返回-springboot会自动转为json响应
        return userList;
    }

    // https://baomidou.com/pages/226c21/#%E5%BC%80%E5%A7%8B%E4%BD%BF%E7%94%A8
//    SB教程
    @GetMapping("/mybatis/plus/cat/list")
    public List<Cat> catList(){
        // 返回数据列表
        return this.catMapper.selectList(null);
    }

    @GetMapping("/change/list")
    public void changeList(){
        List<Cat> catList = new ArrayList<>();
        Cat cc = new Cat();
        cc.setName("jj");
        // int可以直接赋值但是long需要转一下
        Long ii = new Long(1);
        cc.setId(ii);
        catList.add(cc);
        List<UserModel> userList = build(catList);
        System.out.println(userList);
    }

    public static List<UserModel> build(List<Cat> catList) {
        return catList.stream()
                .map(UserModel::build)
                .collect(Collectors.toList());
    }


    /**
     * 提交验证
     *
     */
    // @PreAuthorize("hasAnyAuthority('edit')")
    // javax.validation
    @PostMapping("/submit")
    // notEmpty - 被注释的字符串必须非空
    // notNull - 被注释的元素不能为null
    // controller接口的方法参数加入@Valid注解，表示当前的实体类接收的参数需要根据配置的@NotNull注解判断
    public String submitIncident(@RequestBody @NotNull @Valid SubmitUserForm sub, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.toString();
        }
        // com.fasterxml.jackson.databind.exc.InvalidDefinitionException:
        // Cannot construct instance of `com.example.study.model.SubmitUserForm`
        // (no Creators, like default constructor, exist):
        // cannot deserialize from Object value (no delegate- or property-based Creator)
        // at [Source: (PushbackInputStream); line: 1, column: 2]
        // 当直接post请求没有任何参数的时候
        // :无法构造实例' com.example.study.model。SubmitUserForm '(没有创建者，像默认构造函数一样，存在):
        // 不能从对象值反序列化(没有基于委托或属性的创建者)
        System.out.println(sub);
        return  "success";
    }

    @PostMapping("/submit/two")
    public String work(@Validated @RequestBody SubmitUserForm sub, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors().toString();
        }
        return "add success "+sub.toString();
    }

    @GetMapping("test/global")
    public void ttt(){
        throw new NullPointerException("test global exception");
    }
}
