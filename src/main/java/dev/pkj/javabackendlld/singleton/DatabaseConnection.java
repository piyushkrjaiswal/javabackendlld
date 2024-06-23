package dev.pkj.javabackendlld.singleton;

import java.util.concurrent.locks.Lock;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    String url;
    String userName;
    String password;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }

        return instance;

    }
}
