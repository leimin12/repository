package com.zking.zf.biz.impl;

import com.zking.zf.biz.IYhBiz;
import com.zking.zf.model.Yh;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;


public class YhBizImplTest extends BaseTest {

    @Autowired
    private IYhBiz iYhBiz;

    private Yh yh;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        yh = new Yh();
    }

    @Test
    public void doLogin() throws Exception {
        yh.setYhzh("zs");
        yh.setYhmm("123");
        Yh y = iYhBiz.doLogin(this.yh);
        System.out.println(y);
    }
    @Test
    public void doAdd() throws Exception {
        yh.setYhzh("zs");
        yh.setYhmm("123");
        iYhBiz.add(yh);
    }

}