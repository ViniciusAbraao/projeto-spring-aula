package br.com.unincor.projetoescola.model.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("serial")
@Entity
@Table(name="professores")
@Getter
@Setter
public class Professor extends Pessoa {
	
	private String nroInscricao;
	private LocalDateTime dataCadastro;
	
	public String getNroInscricao() {
		return nroInscricao;
	}
	public void setNroInscricao(String nroInscricao) {
		this.nroInscricao = nroInscricao;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
