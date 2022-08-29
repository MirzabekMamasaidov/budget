package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BudgetPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer budgetPlanId;
    private String name;
    private String description;
    @Column(name = "end_date")
    private Timestamp endDate;
    @Column(name = "start_date")
    private Timestamp startDate;
}
