package com.example.budget.entity;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="budget_member")
public class BudgetMember implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @Column(unique = true,nullable = false)
    private String username;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false,name = "first_name")
    private String firstName;
    @Column(nullable = false,name = "last_name")
    private String lastName;
    @Column(nullable = false,name = "employment_position")
    private String employmentPosition;
    @Column(name = "postal_code")
    private String postalCode;
    @OneToOne
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(role.getName());
        return Collections.singleton(grantedAuthority);    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
