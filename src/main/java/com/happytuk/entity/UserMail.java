package com.happytuk.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_mail")
public class UserMail {

    @Id
    @Column(name = "game_user_id")
    private Integer gameUserId;

    @Column(name = "mail_id")
    private Integer mailId;

    @Column(name = "is_send")
    private Boolean isSend;

    @Column(name = "is_read")
    private Boolean isRead;

    @Column(name = "is_received")
    private Boolean isReceived;

    @Column(name = "send_time")
    private Date sendTime;

    @Column(name = "expire_time")
    private Date expireTime;

    @Column(name = "created_time")
    private Date createdTime;

    public Integer getGameUserId() {
        return gameUserId;
    }

    public void setGameUserId(Integer gameUserId) {
        this.gameUserId = gameUserId;
    }

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public Boolean getSend() {
        return isSend;
    }

    public void setSend(Boolean send) {
        isSend = send;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public Boolean getReceived() {
        return isReceived;
    }

    public void setReceived(Boolean received) {
        isReceived = received;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "UserMail{" +
                "gameUserId=" + gameUserId +
                ", mailId=" + mailId +
                ", isSend=" + isSend +
                ", isRead=" + isRead +
                ", isReceived=" + isReceived +
                ", sendTime=" + sendTime +
                ", expireTime=" + expireTime +
                ", createdTime=" + createdTime +
                '}';
    }
}
