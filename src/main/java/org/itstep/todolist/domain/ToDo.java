package org.itstep.todolist.domain;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NonNull
    @Length(max=100)
    String title;

    @NonNull
    String description;

    LocalDateTime created = LocalDateTime.now();

    Priority priority;
}
