package com.tinder.backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    @Column
    String surname;

    @Column
    String username;

    @Column
    String password;

    @Column
    String password2;

    @Column
    String city;

    @Column
    String country;

    @Column
    String gender;

    @Column
    String birth;



}