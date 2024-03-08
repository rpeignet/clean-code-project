package fr.esgi.cleanbike;

import fr.esgi.cleanbike.business.Course;
import fr.esgi.cleanbike.business.Parcours;
import fr.esgi.cleanbike.repository.CourseRepository;
import fr.esgi.cleanbike.repository.ParcoursRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @BeforeEach
    void deleteAllCourse(){
        courseRepository.deleteAll();
    }

    @Test
    @Order(1)
    void shouldReturnCoursesByUserId(){
        Long userId = 123L;
        courseRepository.save(new Course(1L, 1L, userId, new Date()));
        courseRepository.save(new Course(2L, 3L, userId, new Date()));
        courseRepository.save(new Course(3L, 2L, userId, new Date()));
        List<Course> courses = courseRepository.findAllByUserId(userId);
        assertEquals(3, courses.size());
    }
}
