package com.canviara;


import javax.persistence.Entity;
import javax.persistence.*;

import java.io.Serializable;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Created by zftvs on 4/9/14.
 */
@Entity
public class SpotiWelder implements Serializable {

    private static final long serialVersionUID = -6625241632523446019L;

    private Long id;
    private String username;
    private String password;
    public SpotiWelder() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @NotEmpty
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @NotEmpty
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
