package Lab2.restfull.Repository;

import Lab2.restfull.Domain.courseDomain;
import Lab2.restfull.Domain.studentDomain;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PopulatedData {
    public PopulatedData(){
        populateCourseData();
        populateStudentData();
    }
    List<courseDomain> courses = new ArrayList<>();
    List<studentDomain> students = new ArrayList<>();
    private  void populateCourseData(){
        courses.add(new courseDomain(1, "Introduction to Computer Science", "CS101"));
        courses.add(new courseDomain(2, "Data Structures and Algorithms", "CS201"));
        courses.add(new courseDomain(3, "Database Management Systems", "CS301"));

    }
    private void populateStudentData(){
        students.add(new studentDomain(1,"Hebron","Melles","hebron@gmail.com","Computer Science",3.8,courses));
        students.add(new studentDomain(2,"Genet","Kahsay","Genet@gmail.com","Software Development",3.9,courses));
    }
}
