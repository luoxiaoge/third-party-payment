package com.payment.core.enums;

/**
 * 支付设备
 */
public enum SourceOfPayment {

    MOBILE_PAY(1),// 手机支付
    PC_PAY(2), // pc
    H5_PAY(3);// H5网页

    int value;

    SourceOfPayment(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
