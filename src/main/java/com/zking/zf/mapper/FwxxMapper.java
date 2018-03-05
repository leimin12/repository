package com.zking.zf.mapper;

import com.zking.zf.model.Fwxx;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FwxxMapper {
    int deleteByPrimaryKey(Integer fwbh);

    int insert(Fwxx record);

    int insertSelective(Fwxx record);

    Fwxx selectByPrimaryKey(Integer fwbh);

    int updateByPrimaryKeySelective(Fwxx record);

    int updateByPrimaryKey(Fwxx record);

    List<Fwxx> list(Fwxx fwxx);
}