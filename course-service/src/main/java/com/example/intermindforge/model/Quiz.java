package com.example.intermindforge.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_quiz_id", referencedColumnName = "id")
    private List<QuizQuestion> questions;
}
