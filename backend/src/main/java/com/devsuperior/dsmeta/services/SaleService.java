package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.domain.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;


@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	
	
	public List<Sale> findSales() {
		
		List<Sale> sales = saleRepository.findAll();
		
		return sales;
		
	}

}
