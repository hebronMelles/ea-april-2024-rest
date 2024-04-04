package Lab2.restfull.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class courseDomain {
    private int id;
    private  String name;
    private String code;

}
