package com.example.project.pharmacy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pharmacy")
public class Pharmacy {

	@Id
	@GeneratedValue
	private Long id;

	private String pharmacyName;

	private String pharmacyAddress;

	private Double latitude;

	private Double longitude;
}
