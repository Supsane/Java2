package ru.geekbrains.java.lesson6.JavaNET.server;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}
