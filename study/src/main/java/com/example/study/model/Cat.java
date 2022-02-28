package com.example.study.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@TableName("t_student")
public class Cat {
    private Long id;
    private String name;
}

////给model bean实现equals方法和hashcode方法
////这个属性值为true时候让equals两个对象的时候输出bool值 - 用自己的属性和从父类继承的属性 来生成hashcode
////false的时候是不管父类继承过来的属性的-默认就是不管父类继承的属性的 - 所以不够准确
//@EqualsAndHashCode(callSuper = true)
//@Data
////字符串类型，不是必填，用来指定数据表名称
//@TableName("t_cat")
//public class Cat extends Model<Cat> implements Serializable {
//
//    @TableId(value = "id", type = IdType.AUTO)
//    private Integer id;
//
//    @TableField("name")
//    private String name;
//
//}


//@Data
//@TableName(value = "user")
//@NoArgsConstructor
//@AllArgsConstructor
//public class User {
//
//    private Long id;
//
//    private String name;
//
//    private Integer age;
//
//    private String email;
//
//    @TableField(fill = FieldFill.INSERT_UPDATE)
//    private String operator;
//}