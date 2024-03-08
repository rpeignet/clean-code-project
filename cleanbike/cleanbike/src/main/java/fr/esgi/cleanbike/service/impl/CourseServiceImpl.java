package fr.esgi.cleanbike.service.impl;

import fr.esgi.cleanbike.business.Course;
import fr.esgi.cleanbike.repository.CourseRepository;
import fr.esgi.cleanbike.service.CourseService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    // Injection de l'interface CourseRepository
    private CourseRepository courseRepository;

    @Override
    public void lancer(Long userId, Long parcoursId) {
        // Logique pour démarrer une course
        // courseRepository.save(new Course(1L, userId, parcoursId, new Date()));
    }

    @Override
    public void arreter(Long courseId) {
        // Logique pour arrêter une course
    }

    @Override
    public List<Course> getHistorique(Long userId) {
        // Retourne l'ensemble des course d'un user
        return courseRepository.findAllByUserId(userId);
    }
}
