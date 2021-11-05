package com.zephyraft.dp._2struct._1proxy._help;

public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
