package Lab2.restfull.Repository;

import Lab2.restfull.Domain.courseDomain;
import Lab2.restfull.Domain.studentDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
@Repository
public class studentRepositoryImpl implements studentRepoInterface{
    @Autowired
    private PopulatedData populatedData;
    @Override
    public List<studentDomain> getStudents() {
        return populatedData.students;
    }

    @Override
    public studentDomain getStdentById(int id) {
        return populatedData.students.stream().filter((x) -> x.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void saveStudent(studentDomain studentDomain) {
       populatedData.students.add(studentDomain);
    }

    @Override
    public void updateStudent(studentDomain studentDomain) {
        int index = IntStream.range(0, populatedData.students.size())
                .filter(i -> populatedData.students.get(i).getId() == studentDomain.getId())
                .findFirst()
                .orElse(-1);
        populatedData.students.set(index,studentDomain);
    }

    @Override
    public void deleteStudent(int id) {
    populatedData.students.remove(populatedData.students.stream().filter((x) -> x.getId() == id).findFirst().orElse(null));
    }

    @Override
    public List<studentDomain> StudentsByMajor(String major) {

        return populatedData.students.stream()
                .filter(stu -> stu.getMajor().equalsIgnoreCase(major))
                .collect(Collectors.toList());
    }

    @Override
    public List<courseDomain> getCoursesByStudentId(int studentId) {
        studentDomain studentDomain1 = populatedData.students.stream().filter((stu) -> stu.getId() == studentId).findFirst().orElse(null);
        return studentDomain1.getCourseTaken();
    }
}
