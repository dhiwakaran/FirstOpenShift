package com.canviara;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.logging.Logger;

/**
 * Created by zftvs on 4/9/14.
 */
@SessionScoped
@Named
public class SpotifyWeb implements Serializable {

    private static final long serialVersionUID = -352191768337315102L;

    private Logger log;

    SpotiWelder spotiWelder = new SpotiWelder();

    @Inject
    FacesContext facesContext;

    public SpotifyWeb() {
        this.log = Logger.getLogger(this.getClass().getSimpleName());
        connection = new SpotiWeldConnection();
    }

    @PostConstruct
    public void initialize() {
        log.info(this.getClass().getSimpleName() + " was constructed");
    }

    public void login() {
        connection.login(spotiWelder.getUsername(), spotiWelder.getPassword());

        log.info("succesful login for " + loggedInUser);
        facesContext.addMessage(null, new FacesMessage("Welcome " + loggedInUser.getName()));
    }

    @Produces
    @Named
    public SpotiWelder getSpotiWelder() {
        return spotiWelder;
    }
}
