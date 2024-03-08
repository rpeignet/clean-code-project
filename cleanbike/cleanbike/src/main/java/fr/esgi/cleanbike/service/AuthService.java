package fr.esgi.cleanbike.service;

public interface AuthService {
    void login(String login, String password);

    void logout(Long userId);
}
