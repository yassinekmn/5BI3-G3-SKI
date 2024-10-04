package com.example.p5bi3g3ski.entities;

import java.io.Serializable;
import java.util.Set;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
public class Instructor implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long numInstructor;
	String firstName;
	String lastName;
	LocalDate dateOfHire;
	@OneToMany
	Set<Course> courses;
}
