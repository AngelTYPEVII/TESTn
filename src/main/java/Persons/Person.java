package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private String name;
    private String lastName;
    private String userName;
    private String PermanentAddress;
    private String CurrentAddress;
    private String eMail;
    private String phoneNumber;
}
