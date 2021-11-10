package com.zephyraft.dp._3behavior._1observer._2async._2eventbus;

import com.google.common.eventbus.EventBus;

public class UserService {
    private final EventBus bus;

    public UserService(EventBus bus) {
        this.bus = bus;
    }

    public long registerAndNotify(String telephone, String password) {
        //省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long uid = register(telephone, password);
        bus.post(uid);
        return uid;
    }

    public long register(String telephone, String password) {
        System.out.println("register");
        return 0L;
    }
}
