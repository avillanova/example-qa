package org.avillanova.example.tests.ui;

import org.avillanova.example.websites.pom.DashboardPage;
import org.avillanova.example.websites.pom.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.avillanova.example.websites.config.Hook.*;
import static org.avillanova.example.websites.enums.Users.LOGIN_INVALIDO;
import static org.avillanova.example.websites.enums.Users.LOGIN_VALIDO;

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
    public void loginInvalido() {
        LoginPage page = new LoginPage();

        String mensagem = page.access()
                .loginInvalido(LOGIN_INVALIDO.getUser())
                .pegarTextLegal();

        Assert.assertEquals("Mensagem de texto legal nao encontrada",
                "Ao me inscrever, aceito os Termos de serviço do Atlassian Cloud e concordo com a Política de Privacidade.",
                mensagem);
    }

    @Test
    public void loginValido() {
       LoginPage page = new LoginPage();

        DashboardPage dashPage = page.access()
                .loginValido(LOGIN_VALIDO.getUser(), LOGIN_VALIDO.getPassword());

        Assert.assertEquals("Mensagem 'Seus Produtos' nao encontrada",
                "url dashboard",
                dashPage.getDashUrl());
    }
}
