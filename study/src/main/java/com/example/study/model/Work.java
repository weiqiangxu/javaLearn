package com.example.study.model;

import afu.org.checkerframework.checker.nullness.qual.Nullable;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
public class Work {
    /**
     * 事件id
     */
    @Nullable
    @Size(message = "uuId校验失败", max = 64)
    private String uuId;

    @NotNull
    @Size(message = "name校验失败", max = 40)
    @Pattern(message = "name校验失败", regexp = "[^*<>()\\\"'%\\\\[\\\\]+&\\\\\\\\]*")
    private String name;
}
