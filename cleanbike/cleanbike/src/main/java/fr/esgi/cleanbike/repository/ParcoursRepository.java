package fr.esgi.cleanbike.repository;

import fr.esgi.cleanbike.business.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursRepository extends JpaRepository<Parcours, Long> {
}
