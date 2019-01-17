package com.rezero.gradu.service.impl;

import com.rezero.gradu.entity.Hot;
import com.rezero.gradu.repository.HotRepository;
import com.rezero.gradu.service.HotService;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class HotESServiceImpl implements HotService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HotESServiceImpl.class);

    @Autowired
    HotRepository hotRepository;

    @Override
    public Long saveHot(Hot hot) {

        Hot hotResult = hotRepository.save(hot);
        return hotResult.getId();
    }

//    @Override
//    public List<Hot> searchHot(Integer pageNumber,
//                                 Integer pageSize,
//                                 String searchContent) {
//        // 分页参数
//        Pageable pageable = new PageRequest(pageNumber, pageSize);
//
//        // Function Score Query
//        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("hotname", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(1000))
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("description", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(100));
//
//        // 创建搜索 DSL 查询
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withPageable(pageable)
//                .withQuery(functionScoreQueryBuilder).build();
//
//        LOGGER.info("\n searchHot(): searchContent [" + searchContent + "] \n DSL  = \n " + searchQuery.getQuery().toString());
//
//        Page<Hot> searchPageResults = hotRepository.search(searchQuery);
//        return searchPageResults.getContent();
//    }


    @Override
    public List<Hot> searchHot(String searchContent) {
        return null;
    }

    @Override
    public Hot findByName(String name) {
        return hotRepository.findByName("lala");
    }
}
