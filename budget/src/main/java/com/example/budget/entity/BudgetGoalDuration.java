package com.example.budget.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BudgetGoalDuration {
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
