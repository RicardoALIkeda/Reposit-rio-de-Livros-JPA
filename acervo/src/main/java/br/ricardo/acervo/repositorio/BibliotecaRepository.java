package br.ricardo.acervo.repositorio;

import br.ricardo.acervo.entidade.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}