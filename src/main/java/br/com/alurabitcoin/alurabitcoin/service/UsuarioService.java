package br.com.alurabitcoin.alurabitcoin.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.alurabitcoin.alurabitcoin.exception.RecursoNaoEncontradoException;
import br.com.alurabitcoin.alurabitcoin.repositorio.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return usuarioRepository.findByUsername(username).orElseThrow(() -> new RecursoNaoEncontradoException());
	}
}
