package com.invoiceprocessing.service.services;

import java.util.List;

import com.invoiceprocessing.service.model.Invoice;

public interface InvoiceService {
    public Invoice addInvoice(Invoice invoice);
    public List<Invoice> pullInvoices();
    public Invoice deleteInvoice(long id);
}
