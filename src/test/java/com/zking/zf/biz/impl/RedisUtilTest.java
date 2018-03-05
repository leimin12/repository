package com.zking.zf.biz.impl;

import com.zking.zf.biz.IFwxxBiz;
import com.zking.zf.model.Fwxx;
import com.zking.zf.redis.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisUtilTest extends BaseTest {

    @Autowired
    private IFwxxBiz iFwxxBiz;

    @Autowired
    private RedisUtil redisUtil;

    private Fwxx fwxx;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        fwxx = new Fwxx();
    }
    @Test
    public void load() throws Exception {
        fwxx.setFwbh(3);
        Fwxx f =(Fwxx) redisUtil.get(fwxx.getClass().getName() + "_" + fwxx.getFwbh());
        if (null == f) {
            f = iFwxxBiz.load(fwxx);
            if (null != f) {
                redisUtil.set(fwxx.getClass().getName() + "_" + fwxx.getFwbh(), f);
            }
        }
        System.out.println(f);
    }


}