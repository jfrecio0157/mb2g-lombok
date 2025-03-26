package org.example;

import lombok.*;

/*
Anotaciones para Lombok.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    private String firstName;
    private String lastName;
    private String email;

}
