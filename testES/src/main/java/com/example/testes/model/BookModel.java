package com.example.testes.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 图书
 * @author ChengJianSheng
 * @date 2019-01-07
 */
@Data
public class BookModel implements Serializable {
    private Integer id;         //  图书ID
    private String name;        //  图书名称
    private String author;      //  作者
    private Integer category;   //  图书分类
    private Double price;       //  图书价格

    private String sellReason;  //  上架理由

    private String sellTime;      //  上架时间

    private Integer status;     //  状态（1：可售，0：不可售）

}