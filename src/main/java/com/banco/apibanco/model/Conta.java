package com.banco.apibanco.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "conta")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conta {

	@Id
	@GeneratedValue
	private UUID id;
	private double saldo;
	private String numeroConta;
	private Agencia agencia;
}
