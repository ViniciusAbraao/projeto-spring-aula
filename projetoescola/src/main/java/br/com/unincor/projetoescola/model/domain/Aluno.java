package br.com.unincor.projetoescola.model.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno extends Pessoa {
	
	private String matricula;
	private LocalDateTime dataMatricula;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDateTime getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(LocalDateTime dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
