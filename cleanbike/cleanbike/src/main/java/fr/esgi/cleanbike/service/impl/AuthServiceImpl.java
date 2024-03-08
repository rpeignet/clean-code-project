package fr.esgi.cleanbike.service.impl;

import fr.esgi.cleanbike.service.AuthService;
import fr.esgi.cleanbike.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    // Injection de l'interface UserRepository
    private UserRepository userRepository;

    @Override
    public void login(String login, String password) {
        // Logique de connection
    }

    @Override
    public void logout(Long userId) {
        // Logique de déconnexion
    }

}
