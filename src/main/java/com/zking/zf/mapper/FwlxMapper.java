package com.zking.zf.mapper;

import com.zking.zf.model.Fwlx;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FwlxMapper {
    int deleteByPrimaryKey(Integer lxbh);

    int insert(Fwlx record);

    int insertSelective(Fwlx record);

    Fwlx selectByPrimaryKey(Integer lxbh);

    int updateByPrimaryKeySelective(Fwlx record);

    int updateByPrimaryKey(Fwlx record);

    List<Fwlx> list(Fwlx fwlx);

}