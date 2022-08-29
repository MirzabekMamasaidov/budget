package com.example.budget.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ask_Question")
public class AskQuestion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer questionId;
    private String title;
    private String description;
    private Timestamp date;
    @OneToOne
    private  BudgetMember budgetMember;
}
