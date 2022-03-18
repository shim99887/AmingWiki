package com.thirautech.amingwiki.security;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
    @Value("${server.servlet.session.timeout}")
    private int sessionTime;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("created");
        se.getSession().setMaxInactiveInterval(sessionTime);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("destroyed");
        HttpSessionListener.super.sessionDestroyed(se);
    }
}
