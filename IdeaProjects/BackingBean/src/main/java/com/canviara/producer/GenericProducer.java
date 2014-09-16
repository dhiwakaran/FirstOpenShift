package com.canviara.producer;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by zftvs on 3/9/14.
 */
public class GenericProducer {
    @SuppressWarnings("unused")
    @Produces
    @PersistenceContext
    private EntityManager em;
}
