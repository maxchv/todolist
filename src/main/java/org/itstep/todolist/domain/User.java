package org.itstep.todolist.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @Column(name = "username")
    @NonNull
    String name;

    @Column(name="password")
    @NonNull
    String password;

    @Column(name="enabled")
    @NonNull
    boolean enabled;
}
