package fr.esgi.cleanbike.repository;

import fr.esgi.cleanbike.business.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
