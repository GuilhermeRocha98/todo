package com.todo.list.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private Boolean done;

    @Column
    private LocalDateTime setCreatedDate;

    @Column
    private LocalDateTime doneDate;


//    @PrePersist
//    public void beforeSave(){
//        setCreatedDate(LocalDateTime.now());
//    }


}
