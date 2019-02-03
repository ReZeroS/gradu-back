package com.rezero.gradu.entity;


import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "hotindex", type = "hot")
public class Hot implements Serializable {


    private static final long serialVersionUID = -1L;

    private Long id;
    private String name;




}
