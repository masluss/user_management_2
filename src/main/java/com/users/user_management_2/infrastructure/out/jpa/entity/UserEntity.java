package com.users.user_management_2.infrastructure.out.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_users", nullable = false)
    private Long id;

    @NotBlank
    @Email
    @Column(name = "email_user", nullable = false)
    private String email;

    @Column(name = "password_user")
    private String password;

    @Column(name = "identification_user", nullable = false)
    private String identification;

    @Column(name = "name_user")
    private String name;

    @Column(name = "lastname_user")
    private String lastname;

    @Column(name = "telephone_user")
    private String telephone;

    @Column(name = "role_user")
    private String roleEntity;
}
