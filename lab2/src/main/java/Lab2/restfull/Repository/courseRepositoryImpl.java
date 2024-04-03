package Lab2.restfull.Repository;


import Lab2.restfull.Domain.courseDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.IntStream;

@Repository
public class courseRepositoryImpl implements courseRepoInterface{

    @Autowired
    private PopulatedData populatedData;

    @Override
    public List<courseDomain> getCourses() {
        return populatedData.courses;
    }
    @Override
    public courseDomain getCourseById(int id) {
        return populatedData.courses.stream().filter((x) -> x.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void saveCourse(courseDomain courseDomain) {
         populatedData.courses.add(courseDomain);
    }

    @Override
    public void updateCourse(courseDomain updatedCourseDomain) {
        int index = IntStream.range(0, populatedData.courses.size())
                .filter(i -> populatedData.courses.get(i).getId() == updatedCourseDomain.getId())
                .findFirst()
                .orElse(-1);
     populatedData.courses.set(index,updatedCourseDomain);
    }



    @Override
    public void deleteCourse(int id) {
        populatedData.courses.remove(populatedData.courses.stream().filter((x) -> x.getId() == id).findFirst().orElse(null));
    }


}
