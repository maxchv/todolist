package org.itstep.todolist.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity(name = "todolist")
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

    @Column(updatable = false)
    @CreationTimestamp
    LocalDateTime created;

    @UpdateTimestamp
    LocalDateTime lastUpdate;

    Priority priority;

    boolean done;
}
