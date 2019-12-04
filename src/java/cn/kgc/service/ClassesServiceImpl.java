package cn.kgc.service;

import cn.kgc.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClassesServiceImpl implements ClassesService{
    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public List<Map<String, Object>> showClasses() {
        return classesMapper.showClasses();
    }
}
