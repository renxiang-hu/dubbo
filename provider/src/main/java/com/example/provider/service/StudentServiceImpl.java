package com.example.provider.service;

import com.example.common.model.Student;
import com.example.common.service.IStudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
public class StudentServiceImpl implements IStudentService {

    @Override
    public Student queryById(Integer id) {
        Student student = new Student();
        if (1001==id) {
            student.setAge(21);
            student.setId(id);
            student.setName("张三");
        }else if (1002==id) {
            student.setAge(22);
            student.setId(id);
            student.setName("李四");
        }
        return student;
    }
}
