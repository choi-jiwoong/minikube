package com.sea4.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter @Builder
@NoArgsConstructor @AllArgsConstructor

public class Demo {
	@Id @GeneratedValue
	private Long id;

	@Column
	private String name;

	@Column
	private String text;

}
