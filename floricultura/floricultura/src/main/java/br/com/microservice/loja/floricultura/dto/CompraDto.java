package br.com.microservice.loja.floricultura.dto;

import java.util.List;

public class CompraDto {
	
	private List<ItenCompraDto> itens;
	
	private EndercoDto endereco;

	public List<ItenCompraDto> getItens() {
		return itens;
	}

	public void setItens(List<ItenCompraDto> itens) {
		this.itens = itens;
	}

	public EndercoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EndercoDto endereco) {
		this.endereco = endereco;
	}
	
	

}
