package org.itstep.todolist.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @Column(name = "username")
    String name;

    @Column(name="password")
    String password;

    @Column(name="enabled")
    boolean enabled;
}
