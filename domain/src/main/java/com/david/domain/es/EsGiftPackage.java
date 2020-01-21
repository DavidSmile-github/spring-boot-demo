package com.david.domain.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Document(indexName = "appstore_gift_vpc", type = "gift_package",shards=3,replicas=1,createIndex = true)
@Data
public class EsGiftPackage implements Serializable{

    private static final long serialVersionUID = -5782562107147314080L;
    @Id
    private Long id;

    @Field(type = FieldType.text,analyzer = "ik-pinyin-analyzer",searchAnalyzer = "ik-pinyin-analyzer")
    private String name;

    @Field(type = FieldType.text,analyzer = "ik_smart",searchAnalyzer = "ik_smart")
    private String content;

    @Field(type = FieldType.keyword)
    private String receiveMethod;

    @Field(type = FieldType.Long)
    private Long startTime;

    @Field(type = FieldType.Long)
    private Long endTime;

    @Field(type = FieldType.Integer)
    private  Integer appliedCount;

    @Field(type = FieldType.keyword)
    private String remarks;

    @Field(type = FieldType.keyword)
    private String creatorId;

    @Field(type = FieldType.Long)
    private Long createTime;

    @Field(type = FieldType.Integer)
    private Integer status;

    @Field(type = FieldType.Integer)
    private Integer recommendPlace;

    @Field(type = FieldType.keyword)
    private String recommendPic;

    @Field(type = FieldType.Integer)
    private Integer noOwnerCount;//还未领取个数

    @Field(type = FieldType.Integer)
    private  Integer invitationCount;

    @Field(type = FieldType.Integer)
    private Integer phaseStatus;//礼包的阶段

    @Field(type = FieldType.Integer)
    private Integer remainingDays;//剩余天数

    @Field(type = FieldType.Integer)
    private Integer isReceived;//该礼包是否已领取过

    @Field(type = FieldType.keyword)
    private String receivedInvitation;//领取的邀请码

    @Field(type = FieldType.Integer)
    private Integer isRecommend;

    @Field(type = FieldType.Integer)
    private Integer isExclusive;

    @Field(type = FieldType.Long)
    private Long updateTime;

    @Field(type = FieldType.Nested)
    private EsSimpleGame game;

    private Long gameId;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    private Integer sortNum=99;//邀请码

}
