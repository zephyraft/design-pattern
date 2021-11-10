package com.zephyraft.dp._3behavior._1observer._help;

import com.zephyraft.dp._3behavior._1observer._help.PromotionService;
import com.zephyraft.dp._3behavior._1observer._help.RegObserver;

public class RegPromotionObserver implements RegObserver {
    private final PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    public void onRegSuccess(long uid) {
        // 发放体验金
        promotionService.issueNewUserExperienceCash(uid);
    }
}
