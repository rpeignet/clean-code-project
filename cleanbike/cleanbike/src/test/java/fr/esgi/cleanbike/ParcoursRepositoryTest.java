package fr.esgi.cleanbike;

import fr.esgi.cleanbike.business.Parcours;
import fr.esgi.cleanbike.repository.ParcoursRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ParcoursRepositoryTest {
    @Autowired
    private ParcoursRepository parcoursRepository;

    @BeforeEach
    void deleteAllParcours(){
        parcoursRepository.deleteAll();
    }

    @Test
    @Order(1)
    void shouldAjouterParcours(){
        parcoursRepository.save(new Parcours(1L, "/test", "Course 1"));
        assertEquals(1L, parcoursRepository.count());
    }
}
