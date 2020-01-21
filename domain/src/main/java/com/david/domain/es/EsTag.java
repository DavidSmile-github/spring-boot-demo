package com.david.domain.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

//@Document(indexName = "tag", type = "tag",shards=4,replicas=2,createIndex = false)
@Data
public class EsTag implements Serializable {

    private static final long serialVersionUID = -9133177561992346862L;
    @Id
    private Integer id;

    @Field(type = FieldType.Integer)
    private Integer parentId;

    @Field(type = FieldType.keyword)
    private String name;

    @Field(type = FieldType.Integer)
    private Integer status;

}
