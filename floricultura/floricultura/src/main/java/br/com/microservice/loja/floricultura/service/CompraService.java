package br.com.microservice.loja.floricultura.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.loja.floricultura.dto.CompraDto;
import br.com.microservice.loja.floricultura.dto.InfoFornecedorDto;

@Service
public class CompraService {

	public void realizarCompra(CompraDto dto) {
		
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<InfoFornecedorDto> entity = client.exchange("http://localhost:8081/info/" + dto.getEndereco().getEstado()
				,HttpMethod.GET, null, InfoFornecedorDto.class);
		
		System.out.println(entity.getBody().getEndereco());
	}

}
