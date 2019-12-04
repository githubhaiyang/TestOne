package cn.kgc.mapper;


import cn.kgc.vo.Student;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Map<String,Object>> showStudent();

    @Insert("insert into student(name,age,gender,telephone,email,classId) values(#{name},#{age},#{gender},#{telephone},#{email},#{classid})")
    int addStudent(Student student);
}
