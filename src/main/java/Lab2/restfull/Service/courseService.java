package Lab2.restfull.Service;

import Lab2.restfull.Domain.courseDomain;
import Lab2.restfull.Repository.courseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class courseService {
    @Autowired
    private courseRepositoryImpl repository;

    public List<courseDomain> getCourses(){
        return repository.getCourses();
    }
    public courseDomain getcourseById(int id){
        return  repository.getCourseById(id);
    }
    public void saveCourse(courseDomain courseDomain) {
        repository.saveCourse(courseDomain);
    }
    public void updateCourse(courseDomain updatedCourseDomain) {
        repository.updateCourse(updatedCourseDomain);
    }
    public void deleteCourse(int id) {
        repository.deleteCourse(id);
    }
}
