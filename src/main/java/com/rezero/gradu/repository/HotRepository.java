package com.rezero.gradu.repository;

import com.rezero.gradu.entity.Hot;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotRepository extends ElasticsearchRepository<Hot, Long> {
    Hot findByName(String name);
}
