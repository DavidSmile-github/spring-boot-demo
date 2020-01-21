package com.david.domain.es;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

//@Document(indexName = "topic", type = "topic",shards=4,replicas=2,createIndex = false)
@Data
public class EsTopic implements Serializable {

    private static final long serialVersionUID = -1719414115978315082L;
    @Id
    private Long id;

}
