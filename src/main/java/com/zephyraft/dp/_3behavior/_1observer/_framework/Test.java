package com.zephyraft.dp._3behavior._1observer._framework;

import com.zephyraft.dp._3behavior._1observer._help.NotificationService;
import com.zephyraft.dp._3behavior._1observer._help.PromotionService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        EventBus bus = new AsyncEventBus(executorService);
        bus.register(new RegNotificationObserver(new NotificationService()));
        bus.register(new RegPromotionObserver(new PromotionService()));

        UserService userService = new UserService(bus);
        userService.registerAndNotify("123", "456");
        System.out.println("finish");
        safeShutdown(executorService);
    }

    private static void safeShutdown(ExecutorService executorService) {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }

    static class UserService {
        private final EventBus bus;

        public UserService(EventBus bus) {
            this.bus = bus;
        }

        public long registerAndNotify(String telephone, String password) {
            //省略输入参数的校验代码
            // 省略userService.register()异常的try-catch代码
            long uid = register(telephone, password);
            bus.publish(uid);
            return uid;
        }

        public long register(String telephone, String password) {
            System.out.println("register");
            return 0L;
        }
    }


    static class RegNotificationObserver {
        private final NotificationService notificationService;

        public RegNotificationObserver(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        @Subscribe
        public void onRegSuccess(Long uid) {
            // 发送站内信
            notificationService.sendInboxMessage(uid, "Welcome Register...");
        }
    }

    static class RegPromotionObserver {
        private final PromotionService promotionService;

        public RegPromotionObserver(PromotionService promotionService) {
            this.promotionService = promotionService;
        }

        @Subscribe
        public void onRegSuccess(Long uid) {
            // 发放体验金
            promotionService.issueNewUserExperienceCash(uid);
        }
    }
}
