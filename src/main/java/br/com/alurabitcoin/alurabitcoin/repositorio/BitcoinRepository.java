package br.com.alurabitcoin.alurabitcoin.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurabitcoin.alurabitcoin.modelo.Bitcoin;

public interface BitcoinRepository extends JpaRepository<Bitcoin, Long> {

}
