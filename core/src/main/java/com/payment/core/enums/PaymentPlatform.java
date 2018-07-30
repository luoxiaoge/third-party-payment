package com.payment.core.enums;

/**
 * 支付平台
 */
public enum PaymentPlatform {

    WX_PAY(1),// 微信支付
    JD_PAY(2), // 京东支付
    ALI_pay(3), // 支付宝支付
    UNION_PAY(4);//银联支付

    int value;

    PaymentPlatform(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
