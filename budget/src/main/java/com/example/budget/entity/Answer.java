package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Integer answerId;
    @Column(unique = true)
    private String description;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne(cascade = CascadeType.REMOVE)
    private AskQuestion askQuestion;
    @OneToOne
    private BudgetMember budgetMember;

}
