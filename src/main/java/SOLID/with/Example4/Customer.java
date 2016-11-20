package SOLID.with.Example4;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    Count count = new Count();


}
