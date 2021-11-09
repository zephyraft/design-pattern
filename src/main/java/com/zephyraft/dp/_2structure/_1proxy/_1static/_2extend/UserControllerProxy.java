package com.zephyraft.dp._2structure._1proxy._1static._2extend;

import com.zephyraft.dp._2structure._1proxy._help.*;

public class UserControllerProxy extends UserController {

    private final MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        // 委托
        UserVo userVo = super.login(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        // 委托
        UserVo userVo = super.register(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    public static void main(String[] args) {
        IUserController userController = new UserControllerProxy();
        userController.register("a", "b");
    }
}
