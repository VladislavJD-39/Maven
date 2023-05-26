package org.exemple;

public class DbSetting {
    private String name;
    private String password;

    public DbSetting(String name, String password) {
    }

    public void Db(String name, String password) {
        this.name = name;
        this.password = password;
    }
}