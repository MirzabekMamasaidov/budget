package com.example.budget.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Budget_Plan_Duration")
public class BudgetPlanDuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "start_date")
    private Timestamp startDate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "end_date")
    private Timestamp endDate;
    @Column(name = "total_duration")
    private Integer totalDuration;

}
