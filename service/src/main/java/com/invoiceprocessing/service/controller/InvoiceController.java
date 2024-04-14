package com.invoiceprocessing.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocessing.service.model.Invoice;
import com.invoiceprocessing.service.services.InvoiceService;

@RestController
@CrossOrigin
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
    @PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return this.invoiceService.addInvoice(invoice);
	}
    
    @GetMapping("/invoice")
    public List<Invoice> pullInvoices(){
    	return this.invoiceService.pullInvoices();
    }
    
    @DeleteMapping("/invoice/{invoiceId}")
    public Invoice deleteInvoice(@PathVariable String invoiceId) {
    	return this.invoiceService.deleteInvoice(Long.parseLong(invoiceId));
    }
}
