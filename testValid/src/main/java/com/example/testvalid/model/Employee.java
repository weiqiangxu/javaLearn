package com.example.testvalid.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

// 用了小辣椒的的data就会拥有toString\getName等func
@Data
public class Employee {

    @NotNull(message = "name不能为空呀!")
    @Length(min = 3,max = 20, message = "name长度应该在3和20之间!")
    // @NotEmpty
    // @Range
    //
    private String name;
}
