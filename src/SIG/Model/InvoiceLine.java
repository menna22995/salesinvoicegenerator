/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIG.Model;

/**
 *
 * @author ProBook G7
 */
public class InvoiceLine {

    private final int total;

    public InvoiceLine(InvoiceHeader invoice, String name, double price, int count ,int total) {
        this.invoice = invoice;
        this.name = name;
        this.price = price;
        this.count = count;
        this.total=total;
    }
    private InvoiceHeader invoice;
    private String name;
    private double price;
    private int count;

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
