package com.zking.zf.biz;

import com.zking.zf.model.Fwlx;
import com.zking.zf.util.PageBean;

import java.util.List;

public interface IFwlxBiz {
    void add(Fwlx fwlx);

    List<Fwlx> list(Fwlx fwlx, PageBean pageBean);

    List<Fwlx> list(Fwlx fwlx);
}
