package com.example.consumer.controller;

import com.example.common.model.Student;
import com.example.common.service.IStudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    /**
     * 引用远程服务 把创建好的远程服务注入给消费者
     */
    @Reference
    private IStudentService service;

    @PostMapping("/queryById/{id}")
    public Student queryById(@PathVariable("id") Integer id) {

        Student student = service.queryById(id);
        return student;
    }
}
