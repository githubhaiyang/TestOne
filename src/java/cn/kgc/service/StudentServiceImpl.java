package cn.kgc.service;

import cn.kgc.mapper.StudentMapper;
import cn.kgc.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> showStudent() {
        return studentMapper.showStudent();
    }
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }
}
