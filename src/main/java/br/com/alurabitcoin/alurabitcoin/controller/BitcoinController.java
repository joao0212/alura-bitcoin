package br.com.alurabitcoin.alurabitcoin.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alurabitcoin.alurabitcoin.dto.BitcoinDTO;
import br.com.alurabitcoin.alurabitcoin.enums.Tipo;
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

	@PostMapping
	public ResponseEntity<BitcoinDTO> adicionar(@RequestBody BitcoinDTO bitcoinDTO,
			UriComponentsBuilder uriComponentsBuilder) {
		Bitcoin bitcoinSalvo = this.bitcoinRepository.save(transformarParaObjeto(bitcoinDTO));
		URI uri = uriComponentsBuilder.path("/bitcoins/{id}").buildAndExpand(bitcoinSalvo.getId()).toUri();
		return ResponseEntity.created(uri).body(this.transformarParaDTO(bitcoinSalvo));
	}

	public BitcoinDTO transformarParaDTO(Bitcoin bitcoin) {
		return new BitcoinDTO(bitcoin.getId(), bitcoin.getPreco(), bitcoin.getTipo().name(), bitcoin.getData());
	}

	public Bitcoin transformarParaObjeto(BitcoinDTO bitcoinDTO) {
		return new Bitcoin(bitcoinDTO.getPreco(), Tipo.valueOf(bitcoinDTO.getTipo().toUpperCase()),
				bitcoinDTO.getData());
	}
}
