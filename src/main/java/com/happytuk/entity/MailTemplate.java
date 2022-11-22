package com.happytuk.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mail_template")
public class MailTemplate {

    @Id
    @Column(name="mail_id")
    private Integer mailId ;

    @Column(name="mail_type")
    private Integer mailType;

    @Column(name = "sender")
    private String sender;

    @Column(name = "mail_name")
    private String mailName;

    @Column(name = "mail_note")
    private String mailNote;

    @Column(name = "send_time")
    private Date sendTime;

    @Column(name = "expired_time")
    private Date receiveTime;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMailName() {
        return mailName;
    }

    public void setMailName(String mailName) {
        this.mailName = mailName;
    }

    public String getMailNote() {
        return mailNote;
    }

    public void setMailNote(String mailNote) {
        this.mailNote = mailNote;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "MailTemplate{" +
                "mailId=" + mailId +
                ", mailType=" + mailType +
                ", sender='" + sender + '\'' +
                ", mailName='" + mailName + '\'' +
                ", mailNote='" + mailNote + '\'' +
                ", sendTime=" + sendTime +
                ", receiveTime=" + receiveTime +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
