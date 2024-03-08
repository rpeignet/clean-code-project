package fr.esgi.cleanbike.controller;

import fr.esgi.cleanbike.service.AuthService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthController {
    // Injection de l'interface AuthService
    private AuthService authService;

    public void login(String login, String password){
        this.authService.login(login, password);
    }

    public void logout(Long userId){
        this.authService.logout(userId);
    }
}
