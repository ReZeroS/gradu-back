package com.rezero.gradu.repository;


import com.google.common.base.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface CrudRepository <T, ID extends Serializable> extends Repository<T, ID> {

        Optional<T> findById(ID id);

        <S extends T> S save(S entity);


}
