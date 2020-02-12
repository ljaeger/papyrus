package laszlo.lj.papyrus.domain;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
