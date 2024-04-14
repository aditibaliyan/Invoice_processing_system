package com.invoiceprocessing.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoiceprocessing.service.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long>{
	
 
}
