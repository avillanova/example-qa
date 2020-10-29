package org.avillanova.example.websites.enums;

public enum Users {

    LOGIN_VALIDO("teste.teste@mailinator.com", "Teste1234"),
    LOGIN_INVALIDO("testeinvalid@email.com", null);

    private String user;
    private String password;

    Users(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
