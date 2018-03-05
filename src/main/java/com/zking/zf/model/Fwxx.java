package com.zking.zf.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Fwxx implements Serializable{
    private static final long serialVersionUID = 47020945577931735L;
    private Integer fwbh;

    private String bt;

    private String dz;

    private Integer zj;

    private String lxr;

    private String lxdh;

    private Integer lxbh;

    private Integer zxqk;

    private Integer szlc;

    private Integer fwcx;

    private String bz;

    private Integer yhbh;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fbrq;

    //用来查询这个金额之间的房屋信息
    private Integer money1;
    private Integer money2;

    public Fwxx(Integer fwbh, String bt, String dz, Integer zj, String lxr, String lxdh, Integer lxbh, Integer zxqk, Integer szlc, Integer fwcx, String bz, Integer yhbh, Date fbrq) {
        this.fwbh = fwbh;
        this.bt = bt;
        this.dz = dz;
        this.zj = zj;
        this.lxr = lxr;
        this.lxdh = lxdh;
        this.lxbh = lxbh;
        this.zxqk = zxqk;
        this.szlc = szlc;
        this.fwcx = fwcx;
        this.bz = bz;
        this.yhbh = yhbh;
        this.fbrq = fbrq;
    }

    public Fwxx() {
        super();
    }

    public Integer getMoney2() {
        return money2;
    }

    public void setMoney2(Integer money2) {
        this.money2 = money2;
    }

    public Integer getMoney1() {
        return money1;
    }

    public void setMoney1(Integer money1) {
        this.money1 = money1;
    }

    public Integer getFwbh() {
        return fwbh;
    }

    public void setFwbh(Integer fwbh) {
        this.fwbh = fwbh;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public Integer getZj() {
        return zj;
    }

    public void setZj(Integer zj) {
        this.zj = zj;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public Integer getLxbh() {
        return lxbh;
    }

    public void setLxbh(Integer lxbh) {
        this.lxbh = lxbh;
    }

    public Integer getZxqk() {
        return zxqk;
    }

    public void setZxqk(Integer zxqk) {
        this.zxqk = zxqk;
    }

    public Integer getSzlc() {
        return szlc;
    }

    public void setSzlc(Integer szlc) {
        this.szlc = szlc;
    }

    public Integer getFwcx() {
        return fwcx;
    }

    public void setFwcx(Integer fwcx) {
        this.fwcx = fwcx;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getYhbh() {
        return yhbh;
    }

    public void setYhbh(Integer yhbh) {
        this.yhbh = yhbh;
    }

    public Date getFbrq() {
        return fbrq;
    }

    public void setFbrq(Date fbrq) {
        this.fbrq = fbrq;
    }

    @Override
    public String toString() {
        return "Fwxx{" +
                "fwbh=" + fwbh +
                ", bt='" + bt + '\'' +
                ", dz='" + dz + '\'' +
                ", zj=" + zj +
                ", lxr='" + lxr + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", lxbh=" + lxbh +
                ", zxqk=" + zxqk +
                ", szlc=" + szlc +
                ", fwcx=" + fwcx +
                ", bz='" + bz + '\'' +
                ", yhbh=" + yhbh +
                ", fbrq=" + fbrq +
                ", money1=" + money1 +
                ", money2=" + money2 +
                '}';
    }
}