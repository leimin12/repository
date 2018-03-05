package com.zking.zf.biz.impl;

import com.zking.zf.biz.IFwxxBiz;
import com.zking.zf.model.Fwxx;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FwxxBizImplTest extends BaseTest {

    @Autowired
    private IFwxxBiz iFwxxBiz;

    private Fwxx fwxx;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        fwxx = new Fwxx();
    }

    @Test
    public void add() throws Exception {
        fwxx.setBt("全新装修wifi高档次公寓房");
        fwxx.setDz("芙蓉区远大一路280号");
        fwxx.setZj(2200);
        fwxx.setLxr("李小姐");
        fwxx.setLxdh("18508410819");
        fwxx.setLxbh(1);
        fwxx.setZxqk(1);
        fwxx.setSzlc(1);
        fwxx.setFwcx(1);
        fwxx.setBz("拎包入住，温馨高档方便！可日租，月租均可！");
        fwxx.setYhbh(2);
        iFwxxBiz.add(fwxx);
    }

    @Test
    public void edit() throws Exception {
        fwxx.setFwbh(2);
        fwxx.setBt("全新装修wifi高档次公寓房2222222222");
        fwxx.setDz("芙蓉区远大一路280号");
        fwxx.setZj(2200);
        fwxx.setLxr("李小姐");
        fwxx.setLxdh("18508410819");
        fwxx.setLxbh(1);
        fwxx.setZxqk(1);
        fwxx.setSzlc(1);
        fwxx.setFwcx(1);
        fwxx.setBz("拎包入住，温馨高档方便！可日租，月租均可！");
        fwxx.setYhbh(2);
        iFwxxBiz.edit(fwxx);
    }

    @Test
    public void del() throws Exception {
        fwxx.setFwbh(2);
        iFwxxBiz.del(fwxx);
    }

    @Test
    public void load() throws Exception {
        fwxx.setFwbh(8);
        Fwxx load = iFwxxBiz.load(fwxx);
        System.out.println(load);
        load = iFwxxBiz.load(fwxx);
        System.out.println(load);
    }

    @Test
    public void list() throws Exception {
        fwxx.setBt("");
        List<Fwxx> fwxxList = iFwxxBiz.list(fwxx, pageBean);
        for (Fwxx f : fwxxList
                ) {
            System.out.println(f);
        }
    }

}