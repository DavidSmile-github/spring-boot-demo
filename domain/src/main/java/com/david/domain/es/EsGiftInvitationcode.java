package com.david.domain.es;

import lombok.Data;

import java.io.Serializable;
@Data
public class EsGiftInvitationcode implements Serializable {
    private static final long serialVersionUID = -2972799826591988335L;

    //我的礼包 先走数据库 获取激活码  然后走ElasticSearch 获取礼包和游戏相关数据
    private EsGiftPackage giftPackage;

    private String code;

}
