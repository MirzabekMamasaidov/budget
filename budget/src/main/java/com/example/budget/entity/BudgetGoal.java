package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BudgetGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer budgetGoalId;
    @Column(name = "start_date")
    private Timestamp startDate;
    @Column(name = "end_date")
    private Timestamp endDate;
    @Column(name = "amount_saved")
    private Integer amountSaved;
    private String description;
    private String name;

}
