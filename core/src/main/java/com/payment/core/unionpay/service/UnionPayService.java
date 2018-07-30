package com.payment.core.unionpay.service;

public interface UnionPayService {

    /**
     * 根据订单ID生成发起支付的表单信息
     * @param orderId 订单ID
     * @return 表单信息你
     */
    String unifiedOrder(final long orderId);
}
