package co.develhope.swaggerexample.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String city;
    private String placeOfBirth;

}
