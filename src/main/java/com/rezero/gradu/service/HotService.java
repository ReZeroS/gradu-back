package com.rezero.gradu.service;

import com.rezero.gradu.entity.Hot;

import java.util.List;

public interface HotService {

    Long saveHot(Hot hot);

//    /**
//     * 根据关键词，function score query 权重分分页查询
//     *
//     * @param pageNumber
//     * @param pageSize
//     * @param searchContent
//     * @return
//     */
//    List<Hot> searchHot(Integer pageNumber, Integer pageSize, String searchContent);


    List<Hot> searchHot(String searchContent);

    Hot findByName(String name);
}
