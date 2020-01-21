package com.david.domain.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

//@Document(indexName = "rankingGame", type = "rankingGame", shards = 4, replicas = 2, createIndex = false)
@Data
public class EsRankingGame implements Serializable {

    private static final long serialVersionUID = 1323743305570137141L;
    @org.springframework.data.annotation.Id
    private Long id;

    @Field(type = FieldType.Long)
    private Long orderNum;

}
