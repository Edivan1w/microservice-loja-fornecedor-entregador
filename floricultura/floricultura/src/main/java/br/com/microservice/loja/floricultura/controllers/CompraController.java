package br.com.microservice.loja.floricultura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.floricultura.dto.CompraDto;
import br.com.microservice.loja.floricultura.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	
	@PostMapping
	public void efetuarCompra(@RequestBody CompraDto dto) {
		compraService.realizarCompra(dto);
	}
	
}
