package com.zephyraft.dp._2struct._1proxy._help;

public class UserController implements IUserController {
    @Override
    public UserVo login(String telephone, String password) {
        System.out.println("login");
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        System.out.println("register");
        return null;
    }
}
