package com.david.elasticsearch.dao.es;

import com.david.domain.es.EsGame;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: HongBo﹒Liu
 * @date: 2020/1/21 16:30
 */
@Repository
public interface GameRepository extends  ElasticsearchCrudRepository<EsGame, Long> {
}
