package com.payment.core.unionpay.entity;

public class Order {

    private int orderId;

    private Float amont;

    public Order() {
    }

    public Order(int orderId, Float amont) {
        this.orderId = orderId;
        this.amont = amont;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Float getAmont() {
        return amont;
    }

    public void setAmont(Float amont) {
        this.amont = amont;
    }
}
