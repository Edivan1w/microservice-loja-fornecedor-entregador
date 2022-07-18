package br.com.microservice.fornecedor.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepositry infoRepositry;

	public InfoFornecedor getInfoPorEstado(String estado) {
       return  infoRepositry.findByEstado(estado);
		
	}

}
