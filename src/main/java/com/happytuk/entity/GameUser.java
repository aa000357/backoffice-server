package com.happytuk.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "game_user")
public class GameUser {

    @Id
    @Column(name="game_user_id")
    private Integer gameUserId;

    @Column(name="nickname")
    private String nickname;

    @Column(name="cafe_name")
    private String cafeName;

    @Column(name="filename")
    private String filename;

    @Column(name="invitation_code")
    private String invitationCode;

    @Column(name="experience")
    private Integer experience;

    @Column(name="coin")
    private Integer coin;

    @Column(name="diamond")
    private Integer diamond;

    @Column(name="free_diamond")
    private Integer freeDiamond;

    @Column(name="birthday")
    private Date birthday;

    @Column(name = "material_content")
    private Integer materialContent;

    @Column(name = "order_content")
    private Integer orderContent;


    public Integer getGameUserId() {
        return gameUserId;
    }

    public void setGameUserId(Integer gameUserId) {
        this.gameUserId = gameUserId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public Integer getFreeDiamond() {
        return freeDiamond;
    }

    public void setFreeDiamond(Integer freeDiamond) {
        this.freeDiamond = freeDiamond;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getMaterialContent() {
        return materialContent;
    }

    public void setMaterialContent(Integer materialContent) {
        this.materialContent = materialContent;
    }

    public Integer getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(Integer orderContent) {
        this.orderContent = orderContent;
    }

    @Override
    public String toString() {
        return "GameUser{" +
                "gameUserId=" + gameUserId +
                ", nickname='" + nickname + '\'' +
                ", cafeName='" + cafeName + '\'' +
                ", filename='" + filename + '\'' +
                ", invitationCode='" + invitationCode + '\'' +
                ", experience=" + experience +
                ", coin=" + coin +
                ", diamond=" + diamond +
                ", freeDiamond=" + freeDiamond +
                ", birthday=" + birthday +
                ", materialContent=" + materialContent +
                ", orderContent=" + orderContent +
                '}';
    }
}

