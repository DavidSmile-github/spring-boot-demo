package com.david.domain.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Created by bignox on 2017/5/11.
 * 只用于嵌套在礼包的中
 */
@Data
public class EsSimpleGame implements Serializable {

    private static final long serialVersionUID = 937810629105952172L;
    @Id
    private Long id;

    @Field(type = FieldType.text, analyzer = "lc_index", searchAnalyzer = "lc_search")
    private String name;


    @Field(type = FieldType.keyword)
    private String installApkUrl;

    @Field(type = FieldType.keyword)
    private String installPcUrl;

    @Field(type = FieldType.keyword)
    private String logoUrl;

    @Field(type = FieldType.Long)
    private Long download;

    @Field(type = FieldType.Integer)
    private Integer score;

}
