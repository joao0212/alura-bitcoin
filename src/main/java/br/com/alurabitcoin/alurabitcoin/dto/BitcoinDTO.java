package br.com.alurabitcoin.alurabitcoin.dto;

import java.time.LocalDate;

public class BitcoinDTO {

	public BitcoinDTO() {

	}

	public BitcoinDTO(Long id, Double preco, String tipo, LocalDate data) {
		this.id = id;
		this.preco = preco;
		this.tipo = tipo;
		this.data = data;
	}

	private Long id;

	private Double preco;

	private String tipo;

	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getPreco() {
		return preco;
	}

	public String getTipo() {
		return tipo;
	}

	public LocalDate getData() {
		return data;
	}
}
