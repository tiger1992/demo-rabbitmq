package com.tiger.rabbitmq.entity;

import com.tiger.rabbitmq.mybatis.base.EntityBase;

public class OrderInfo extends EntityBase {
    /**
     * 消息id
     *
     * @mbggenerated
     */
    private String messageId;

    /**
     * 订单名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 消息id
     *
     * @mbggenerated
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * 消息id
     *
     * @mbggenerated
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * 订单名
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 订单名
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }
}