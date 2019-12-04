package cn.kgc.controller;

import cn.kgc.service.ClassesService;
import cn.kgc.service.StudentService;
import cn.kgc.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CenterController {
    @Autowired
    private ClassesService classesService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/showClasses.do")
    public List<Map<String, Object>> showClasses() {
        return classesService.showClasses();
    }
    @RequestMapping("/showStudent.do")
    public List<Map<String, Object>> showStudent() {
        return studentService.showStudent();
    }
    @RequestMapping("/addStudent.do")
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @RequestMapping("/test.do")
    public void show(){
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
