package org.avillanova.example.tests.ui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.avillanova.example.websites.config.Hook.*;
import static org.avillanova.example.websites.config.Urls.LOGIN_URL;

public class LoginTest {

    @Before
    public void before(){
        setUp();
    }

    @After
    public void after(){

        quit();
    }

    @Test
    public void exemploUiTest() {
        driver().get(LOGIN_URL.getUrl());
    }

}
