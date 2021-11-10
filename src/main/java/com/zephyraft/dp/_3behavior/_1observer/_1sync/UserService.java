package com.zephyraft.dp._3behavior._1observer._1sync;

import com.zephyraft.dp._3behavior._1observer._help.RegObserver;
import com.zephyraft.dp._3behavior._1observer._help.Subject;

import java.util.List;

public class UserService implements Subject {
    private final List<RegObserver> observers;

    public UserService(List<RegObserver> observers) {
        this.observers = observers;
    }

    public Long registerAndNotify(String telephone, String password) {
        //省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long uid = register(telephone, password);
        notify(uid);
        return uid;
    }

    public long register(String telephone, String password) {
        return 0L;
    }

    private void notify(long uid) {
        for (RegObserver observer : observers) {
            observer.onRegSuccess(uid);
        }
    }
}
