package com.zking.zf.biz.impl;

import com.zking.zf.biz.IFwxxBiz;
import com.zking.zf.mapper.FwxxMapper;
import com.zking.zf.model.Fwxx;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FwxxBizImpl implements IFwxxBiz {

    @Autowired
    private FwxxMapper fwxxMapper;

    @Override
    public void add(Fwxx fwxx) {
        fwxxMapper.insert(fwxx);
    }

    @Override
    public void edit(Fwxx fwxx) {
        fwxxMapper.updateByPrimaryKey(fwxx);
    }

    @Override
    public void del(Fwxx fwxx) {
        fwxxMapper.deleteByPrimaryKey(fwxx.getFwbh());
    }

    @Override
    public Fwxx load(Fwxx fwxx) {
        return fwxxMapper.selectByPrimaryKey(fwxx.getFwbh());
    }

    @Override
    public List<Fwxx> list(Fwxx fwxx, PageBean pageBean) {
        return fwxxMapper.list(fwxx);
    }
}
