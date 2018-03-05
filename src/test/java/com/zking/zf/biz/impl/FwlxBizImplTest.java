package com.zking.zf.biz.impl;

import com.zking.zf.biz.IFwlxBiz;
import com.zking.zf.model.Fwlx;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FwlxBizImplTest extends BaseTest{

    @Autowired
    private IFwlxBiz iFwlxBiz;

    private Fwlx fwlx;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        fwlx = new Fwlx();
    }

    @Test
    public void add() throws Exception {
        fwlx.setLxmc("3室2厅");
        iFwlxBiz.add(fwlx);
    }

    @Test
    public void list() throws Exception {
        List<Fwlx> fwlxList = iFwlxBiz.list(fwlx, null);
        for(Fwlx lx:fwlxList){
            System.out.println(lx);
        }
        fwlxList = iFwlxBiz.list(fwlx, null);
        for(Fwlx lx:fwlxList){
            System.out.println(lx);
        }
    }

}