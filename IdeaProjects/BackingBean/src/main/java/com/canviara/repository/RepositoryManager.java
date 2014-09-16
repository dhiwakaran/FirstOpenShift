package com.canviara.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.canviara.model.SimpleProperty;

import java.util.List;


/**
 * Created by zftvs on 3/9/14.
 */
public class RepositoryManager {

    @Inject
    private EntityManager em;

    public List<SimpleProperty> queryCache(){
        Query query = em.createQuery("FROM com.canviara.model.SimpleProperty");

        List <SimpleProperty> list =  query.getResultList();
        return list;
    }
}
