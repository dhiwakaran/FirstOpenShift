

package com.canviara.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;

import javax.inject.Inject;
import javax.inject.Named;
import com.canviara.ejb.ServiceBean;
import com.canviara.model.SimpleProperty;
import com.canviara.producer.Producer;



/**
 * Created by zftvs on 3/9/14.
 */
@Model
public class Manager {

    @Inject
    ServiceBean ejb;

    @Produces
    @Named
    SimpleProperty property;

    @Inject
    Producer producer;

    @PostConstruct
    public void initNewProperty() {
        property = new SimpleProperty();
    }

    public void save() {
        ejb.put(property);
        initNewProperty();
    }

    public void clear(SimpleProperty property) {
        ejb.delete(property);

    }


}
