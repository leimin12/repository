package com.zking.zf.biz.impl;

import com.zking.zf.biz.IFwlxBiz;
import com.zking.zf.mapper.FwlxMapper;
import com.zking.zf.model.Fwlx;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FwlxBizImpl implements IFwlxBiz {

    @Autowired
    private FwlxMapper fwlxMapper;

    @Override
    public void add(Fwlx fwlx) {
        fwlxMapper.insert(fwlx);
    }

    @Override
    public List<Fwlx> list(Fwlx fwlx, PageBean pageBean) {
        return fwlxMapper.list(fwlx);
    }

    @Override
    public List<Fwlx> list(Fwlx fwlx) {
        return fwlxMapper.list(fwlx);
    }
}
