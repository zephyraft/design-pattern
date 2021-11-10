package com.zephyraft.dp._3behavior._1observer._2async._2eventbus;

import com.google.common.eventbus.Subscribe;
import com.zephyraft.dp._3behavior._1observer._help.PromotionService;
import com.zephyraft.dp._3behavior._1observer._help.RegObserver;

public class RegPromotionObserver {
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
