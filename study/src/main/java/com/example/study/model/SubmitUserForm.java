package com.example.study.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data

public class SubmitUserForm {

    // 该注解的作用相当于
    // if (StringUtils.isEmpty(user.getUsername())) {
    //  return Result.fail("用户名不能为空");
    // }
    @NotNull
    @Valid
    private Work work;

    @NotNull
    @NotEmpty
    @Valid
    private String fileId;
}
