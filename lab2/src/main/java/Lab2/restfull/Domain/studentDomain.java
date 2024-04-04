package Lab2.restfull.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
public class studentDomain {
    private  int id;
    private String firstName;
    private  String lastName;
    private String email;
    private String major;
    private double gpa;
    private List<courseDomain> courseTaken;
}
