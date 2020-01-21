package com.david.domain.es;


import lombok.Data;
import org.apache.lucene.document.FieldType;

import java.io.Serializable;

//@Document(indexName = "category", type = "category",shards=4,replicas=2,createIndex = false)
@Data
public class EsCategory implements Serializable{

    private static final long serialVersionUID = 1540404233734197423L;
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer type;

    private String image;

    private Integer orderNum;


    
}
