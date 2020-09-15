package br.com.alurabitcoin.alurabitcoin.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alurabitcoin.alurabitcoin.dto.BitcoinDTO;
import br.com.alurabitcoin.alurabitcoin.modelo.Bitcoin;
import br.com.alurabitcoin.alurabitcoin.repositorio.BitcoinRepository;

@RestController
@RequestMapping("bitcoins")
public class BitcoinController {

	private BitcoinRepository bitcoinRepository;

	public BitcoinController(BitcoinRepository bitcoinRepository) {
		this.bitcoinRepository = bitcoinRepository;
	}

	@GetMapping
	public List<BitcoinDTO> listar() {
		return this.bitcoinRepository.findAll().stream().map(bitcoin -> this.transformarParaDTO(bitcoin))
				.collect(Collectors.toList());
	}

	public BitcoinDTO transformarParaDTO(Bitcoin bitcoin) {
		return new BitcoinDTO(bitcoin.getId(), bitcoin.getPreco(), bitcoin.getTipo().name(), bitcoin.getData());
	}
}
