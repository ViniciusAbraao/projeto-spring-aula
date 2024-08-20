package br.com.unincor.projetoescola.model.services;

import br.com.unincor.projetoescola.exceptions.SalvarAlunoException;
import br.com.unincor.projetoescola.model.domain.Aluno;

public interface AlunoService {
	Aluno salvar(Aluno aluno) throws SalvarAlunoException;
}
