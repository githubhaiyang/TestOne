package cn.kgc.service;

import cn.kgc.vo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/10/6.
 */
public interface StudentService {
    List<Map<String,Object>> showStudent();
    int addStudent(Student student);
}
