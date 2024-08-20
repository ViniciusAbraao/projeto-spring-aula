package br.com.unincor.projetoescola.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unincor.projetoescola.model.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	Optional<Aluno> findByCpfAndAtivoTrue(String cpf);
}
