package fr.esgi.cleanbike.repository;

import fr.esgi.cleanbike.business.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    public List<Course> findAllByUserId(Long userId);
}
