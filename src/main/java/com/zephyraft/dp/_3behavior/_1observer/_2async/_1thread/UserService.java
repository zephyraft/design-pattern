package com.zephyraft.dp._3behavior._1observer._2async._1thread;

import com.zephyraft.dp._3behavior._1observer._help.RegObserver;

import java.util.List;
import java.util.concurrent.Executor;

public class UserService {
    private final List<RegObserver> observers;
    private final Executor executor;

    public UserService(List<RegObserver> observers, Executor executor) {
        this.observers = observers;
        this.executor = executor;
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
            executor.execute(() -> observer.onRegSuccess(uid));
        }
    }
}
