package it.academy.HopeProject.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class UserModel {
    String email;
    String password;
    String phoneNumber;
    String name;
    String surname;
}
