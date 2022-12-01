package com.happytuk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " excel_mail_sender ")
public class ExcelMailSender {

    @Id
    @Column(name = "sender_id")
    private String senderId;

    @Column(name = "sender_zh_tw")
    private String senderZhTw;

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderZhTw() {
        return senderZhTw;
    }

    public void setSenderZhTw(String senderZhTw) {
        this.senderZhTw = senderZhTw;
    }

    @Override
    public String toString() {
        return "ExcelMailTable{" +
                "senderId='" + senderId + '\'' +
                ", senderZhTw='" + senderZhTw + '\'' +
                '}';
    }
}
