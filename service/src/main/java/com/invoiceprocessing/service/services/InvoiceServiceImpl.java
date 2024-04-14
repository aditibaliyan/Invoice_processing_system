package com.invoiceprocessing.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocessing.service.dao.InvoiceDao;
import com.invoiceprocessing.service.model.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	InvoiceDao invoiceDao;
	@Override
	public Invoice addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceDao.save(invoice);
		return invoice;
	}
	
	@Override
	public List<Invoice> pullInvoices() {
		return invoiceDao.findAll();
		 
	}

	@Override
	public Invoice deleteInvoice(long id) {
		Invoice invoice= invoiceDao.findById(id).get();
		invoiceDao.delete(invoice);
		return invoice;
	}

		
}
