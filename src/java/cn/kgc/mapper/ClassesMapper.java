package cn.kgc.mapper;


import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ClassesMapper {
    @Select("select * from classes")
    List<Map<String,Object>> showClasses();
}
