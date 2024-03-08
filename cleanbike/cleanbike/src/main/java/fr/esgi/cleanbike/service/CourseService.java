package fr.esgi.cleanbike.service;

import fr.esgi.cleanbike.business.Course;

import java.util.List;

public interface CourseService {
    void lancer(Long userId, Long parcoursId);
    void arreter(Long courseId);
    List<Course> getHistorique(Long userId);
}
