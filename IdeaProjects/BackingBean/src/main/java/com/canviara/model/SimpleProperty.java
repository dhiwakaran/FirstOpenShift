package com.canviara.model;

import javax.persistence.*;




/**
 * Created by zftvs on 3/9/14.
 */
@Entity
public class SimpleProperty {

    @Id
    @Column(name="id")
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

