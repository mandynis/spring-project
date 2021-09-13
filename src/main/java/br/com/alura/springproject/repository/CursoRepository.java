package br.com.alura.springproject.repository;

import br.com.alura.springproject.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, String> {

    Curso findByNome(String nomeCurso);
}
