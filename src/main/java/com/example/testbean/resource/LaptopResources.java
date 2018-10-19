package com.example.testbean.resource;

import com.example.testbean.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/laptop")
public class LaptopResources {

    private StudentService studentService;

    public LaptopResources(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String getLaptopNameById(@PathVariable("id") String id) throws SQLException {
        return "laptop's name is " +studentService.getLaptopName(id);
    }
}
