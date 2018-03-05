package com.zking.zf.model;

import java.io.Serializable;

public class Fwlx implements Serializable{
    private static final long serialVersionUID = -3500159639845280152L;
    private Integer lxbh;

    private String lxmc;

    public Fwlx(Integer lxbh, String lxmc) {
        this.lxbh = lxbh;
        this.lxmc = lxmc;
    }

    public Fwlx() {
        super();
    }

    public Integer getLxbh() {
        return lxbh;
    }

    public void setLxbh(Integer lxbh) {
        this.lxbh = lxbh;
    }

    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    @Override
    public String toString() {
        return "Fwlx{" +
                "lxbh=" + lxbh +
                ", lxmc='" + lxmc + '\'' +
                '}';
    }
}