package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Earn_Income")
public class EarnIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "income_id")
    private Integer incomeId;
    private Float amount;
    private String title;
    private String description;
    private String category;
    private Timestamp date;
    @OneToMany
    private List<BudgetMember> budgetMember;
}
