package com.zking.zf.biz;

import com.zking.zf.model.Fwxx;
import com.zking.zf.util.PageBean;

import java.util.List;

public interface IFwxxBiz {
    void add(Fwxx fwxx);

    void edit(Fwxx fwxx);

    void del(Fwxx fwxx);

    Fwxx load(Fwxx fwxx);

    List<Fwxx> list(Fwxx fwxx, PageBean pageBean);

}
