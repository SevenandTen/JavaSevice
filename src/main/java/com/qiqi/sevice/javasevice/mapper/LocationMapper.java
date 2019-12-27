package com.qiqi.sevice.javasevice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LocationMapper {

    public List<Map<String,Object>> getAll();

}
