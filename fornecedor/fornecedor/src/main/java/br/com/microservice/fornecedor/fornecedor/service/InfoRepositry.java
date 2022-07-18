package br.com.microservice.fornecedor.fornecedor.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepositry extends JpaRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);

}
