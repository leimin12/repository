package com.zking.zf.model;


import javax.validation.GroupSequence;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class Yh implements Serializable {
    private Integer yhbh;

    public static interface ValidateGroups {
        interface login {
        }

        interface reg {
        }

        public interface One {
        }

        public interface Two {
        }

        @GroupSequence({One.class, Two.class})
        public interface Group {
        }
    }


    @NotBlank(message = "用户名不能为空", groups = {Yh.ValidateGroups.login.class, Yh.ValidateGroups.reg.class,Yh.ValidateGroups.One.class})
    @Pattern(regexp = "^\\w{2,6}$", message = "用户名要在3-6之间", groups = {Yh.ValidateGroups.login.class, Yh.ValidateGroups.reg.class,Yh.ValidateGroups.Two.class})
    private String yhzh;

    @NotBlank(message = "密码不能为空", groups = {Yh.ValidateGroups.login.class,Yh.ValidateGroups.reg.class})
    private String yhmm;

    @NotBlank(message = "姓名不能为空", groups = {Yh.ValidateGroups.reg.class})
    private String uname;

    public Yh(Integer yhbh, String yhzh, String yhmm) {
        this.yhbh = yhbh;
        this.yhzh = yhzh;
        this.yhmm = yhmm;
    }

    public Yh() {
        super();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getYhbh() {
        return yhbh;
    }

    public void setYhbh(Integer yhbh) {
        this.yhbh = yhbh;
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }

    public String getYhmm() {
        return yhmm;
    }

    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }

    @Override
    public String toString() {
        return "Yh{" +
                "yhbh=" + yhbh +
                ", yhzh='" + yhzh + '\'' +
                ", yhmm='" + yhmm + '\'' +
                '}';
    }
}