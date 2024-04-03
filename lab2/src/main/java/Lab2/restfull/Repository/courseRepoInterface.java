package Lab2.restfull.Repository;

import Lab2.restfull.Domain.courseDomain;

import java.util.List;

public interface courseRepoInterface {
     List<courseDomain> getCourses();
     void saveCourse(courseDomain courseDomain);
     void updateCourse(courseDomain courseDomain);
     courseDomain getCourseById(int id);
     void deleteCourse(int id);

}
