package com.rishi.mvc.Controllers;

import com.rishi.mvc.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.*;


@RestController
@RequestMapping("/student")
public class StudentController {
    //create student
    /*
    * data:required
    *
    * we are receiving data in json format
    * json --> java object ==> deserialization
    * java object --> json  ==> serialization
    * */

// for Signal Student
  /*  @PostMapping("/create")
    public String createStudent(@RequestBody Map<String, Object> data) {

        //we have to create student
//        System.out.println(data);
//        Object name = data.get("name");
//        Object empId = data.get("empId");
//        System.out.println("Name "+name);
//        System.out.println("Emp Id "+empId);
    return "created";
    }*/

// for multiple student list
  /*  @PostMapping("/create")
    public Student createStudent(@RequestBody List<Student> students) {
        System.out.println("Student list size "+students.size());
        System.out.println(students);
        //we have to create student
//        System.out.println(data);
//        Object name = data.get("name");
//        Object empId = data.get("empId");
//        System.out.println("Name "+name);
//        System.out.println("Emp Id "+empId);
//        return students;
        return students.get(0);*/

    /*@PostMapping("/create")
    public Student createStudent(@RequestBody List<Student> students) {
        System.out.println("Student list size "+students.size());
        System.out.println(students);
        //we have to create student
//        System.out.println(data);
//        Object name = data.get("name");
//        Object empId = data.get("empId");
//        System.out.println("Name "+name);
//        System.out.println("Emp Id "+empId);
//        return students;

       // List<String> foods = Array.asList("Pizza", "Burger");
        return students.get(0);
//        Map<String, Object> data = new HashMap<>();
//        data.put("content", students);
//        data.put("error","Not error found");
//        data.put("currrentData", new Date());
     //   return data;
    }*/
//Map use
    /*@PostMapping("/create")
    public Map<String, Object> createStudent(@RequestBody List<Student> students) {
        System.out.println("Student list size "+students.size());
        System.out.println(students);
        //we have to create student
//        System.out.println(data);
//        Object name = data.get("name");
//        Object empId = data.get("empId");
//        System.out.println("Name "+name);
//        System.out.println("Emp Id "+empId);
//        return students;

//         List<String> foods = Array.asList("Pizza", "Burger");
//        return foods;
        Map<String, Object> data = new HashMap<>();
        data.put("content", students);
        data.put("error","No error found");
        data.put("currentData", new Date());
        data.put("SystemInformation",System.getProperties());
        return  data;
    }*/


    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {
        System.out.println("Student list size " + students.size());
        System.out.println(students);

//        String string = null;
//        System.out.println(string.length());
        Student student = students.get(0);
        student.setDept("Test");
//        ResponseEntity<Student> responseEntity = new ResponseEntity<>(student, HttpStatus.CREATED);  //201
//        ResponseEntity<Student> responseEntity = new ResponseEntity<>(student, HttpStatus.NOT_FOUND);  //404
        ResponseEntity<Student> responseEntity = ResponseEntity.status(HttpStatus.OK).body(student);
        return responseEntity;
    }


}
