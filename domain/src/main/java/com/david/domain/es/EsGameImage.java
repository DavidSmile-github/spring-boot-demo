package com.david.domain.es;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by qiazopengfei on 2017/4/25.
 */
//@Document(indexName = "gameImage", type = "gameImage",shards=4,replicas=2,createIndex = false)
@Data
public class EsGameImage implements Serializable{

    private static final long serialVersionUID = 4475302504711856486L;
    private Long id;

    private Integer orderNum;

    private String url;


}
