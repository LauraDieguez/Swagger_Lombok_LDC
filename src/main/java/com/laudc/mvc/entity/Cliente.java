package com.laudc.mvc.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name="Cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha")
	private String fecha;

	@Column(name="dni")
	private String dni;
	
	
}
