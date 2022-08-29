package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Member_Location")
public class MemberLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "postal_code")
    private String postalCode;
    private String country;
}
