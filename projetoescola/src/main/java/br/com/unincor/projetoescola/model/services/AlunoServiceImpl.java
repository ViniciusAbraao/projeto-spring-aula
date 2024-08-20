package br.com.unincor.projetoescola.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unincor.projetoescola.exceptions.SalvarAlunoException;
import br.com.unincor.projetoescola.model.domain.Aluno;
import br.com.unincor.projetoescola.model.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService{
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	@Override
	public Aluno salvar(Aluno aluno) throws SalvarAlunoException {
		var alunoFindCpf = alunoRepository.findByCpfAndAtivoTrue(aluno.getCpf());
		
		if(aluno.getId() == null && alunoFindCpf.isPresent()) {
			throw new SalvarAlunoException("Este CPF está cadastrado");
		}
		return alunoRepository.save(aluno);
	}
	
	
}
