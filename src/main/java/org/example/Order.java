package org.example;

import java.util.List;

public class Order {
    private long orderId;
    private Customer customer;
    private  List<Items> Items;

    private Payment payment;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Items> getItems() {
        return Items;
    }

    public void setItems(List<Items> items) {
        Items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }








}
