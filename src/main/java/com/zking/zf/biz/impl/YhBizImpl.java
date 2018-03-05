package com.zking.zf.biz.impl;

import com.zking.zf.biz.IYhBiz;
import com.zking.zf.mapper.YhMapper;
import com.zking.zf.model.Yh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YhBizImpl implements IYhBiz {

    @Autowired
    private YhMapper yhMapper;

    @Override
    public Yh doLogin(Yh yh) {
        return yhMapper.doLogin(yh);
    }

    @Override
    public void add(Yh yh) {
        yhMapper.insert(yh);
    }
}
