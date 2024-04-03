package Lab2.restfull.Service;

import Lab2.restfull.Domain.courseDomain;
import Lab2.restfull.Domain.studentDomain;
import Lab2.restfull.Repository.studentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class studentService {
    @Autowired
    private studentRepositoryImpl studentRepository;
    public List<studentDomain> getStudents() {
        return studentRepository.getStudents();
    }
    public studentDomain getStdentById(int id) {
        return studentRepository.getStdentById(id);
    }

    public void saveStudent(studentDomain studentDomain) {
       studentRepository.saveStudent(studentDomain);
    }

    public void updateStudent(studentDomain studentDomain) {
        studentRepository.updateStudent(studentDomain);
    }

    public void deleteStudent(int id) {
       studentRepository.deleteStudent(id);
    }
    public List<studentDomain> StudentsByMajor(String major) {
        return studentRepository.StudentsByMajor(major);
    }
    public List<courseDomain> getCoursesByStudentId(int studentId) {
        return studentRepository.getCoursesByStudentId(studentId);
    }
}
