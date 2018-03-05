package com.zking.zf.mapper;

import com.zking.zf.model.Yh;
import org.springframework.stereotype.Repository;

@Repository
public interface YhMapper {
    int deleteByPrimaryKey(Integer yhbh);

    int insert(Yh record);

    int insertSelective(Yh record);

    Yh selectByPrimaryKey(Integer yhbh);

    int updateByPrimaryKeySelective(Yh record);

    int updateByPrimaryKey(Yh record);

    Yh doLogin(Yh yh);
}