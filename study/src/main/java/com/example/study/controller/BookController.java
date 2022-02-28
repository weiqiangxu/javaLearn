package com.example.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文档操作
 * @author ChengJianSheng
 * @date 2019-01-07
 */
@Slf4j
@RestController
public class BookController {
    //自动注入工具类
//    @Autowired
//    ElasticsearchTemplate<Main2,String> elasticsearchTemplate;

//    public void testCount(){
        // Class<T> clazz 其对应的就是定义的一个class的  Class.forName()\X.class, 所以Class<String>也就是String.class
        // 这个T代表 type,也就是java类


//        //执行查询
//        Request request = new Request("GET","/esdemo/_search");
//        request.setEntity(new NStringEntity("{\"query\":{\"match_all\":{\"boost\":1.0}}}", ContentType.APPLICATION_JSON));
//        Response response = null;
//        try {
//            response = elasticsearchTemplate.request(request);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        RequestLine requestLine = response.getRequestLine();
//        HttpHost host = response.getHost();
//        int statusCode = response.getStatusLine().getStatusCode();
//        Header[] headers = response.getHeaders();
//        String responseBody = null;
//        try {
//            responseBody = EntityUtils.toString(response.getEntity());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(responseBody);
//    }

}
