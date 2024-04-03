package Lab2.restfull.Controllers;

import Lab2.restfull.Domain.courseDomain;
import Lab2.restfull.Domain.studentDomain;
import Lab2.restfull.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {
    @Autowired
    private studentService studentService;

    @GetMapping
    public List<studentDomain> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public studentDomain getStdentById(@PathVariable int id) {
        return studentService.getStdentById(id);
    }

  @PostMapping
    public void saveStudent(@RequestBody studentDomain studentDomain) {
        studentService.saveStudent(studentDomain);
    }

    @PutMapping
    public void updateStudent(@RequestBody studentDomain studentDomain) {
       studentService.updateStudent(studentDomain);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
      studentService.deleteStudent(id);
    }
    @GetMapping("/major")
    public List<studentDomain> StudentsByMajor(@RequestParam("major") String major) {
        return studentService.StudentsByMajor(major);
    }

    @GetMapping("/{studentId}/courses")
    public List<courseDomain> getCoursesByStudentId(@PathVariable int studentId) {
        return studentService.getCoursesByStudentId(studentId);
    }
}
