package fr.esgi.cleanbike.controller;

import fr.esgi.cleanbike.business.Course;
import fr.esgi.cleanbike.service.CourseService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseController {
    // Injection de l'interface CourseService
    private CourseService courseService;

    public void lancer(Long userId, Long parcoursId) {
        courseService.lancer(userId, parcoursId);
    }

    public void arreter(Long courseId) {
        courseService.arreter(courseId);
    }

    public List<Course> getHistorique(Long userId) {
        return courseService.getHistorique(userId);
    }
}
