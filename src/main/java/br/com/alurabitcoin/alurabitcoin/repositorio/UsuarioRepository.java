package br.com.alurabitcoin.alurabitcoin.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurabitcoin.alurabitcoin.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByUsername(String username);

}
