package com.rest.demo;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestDemoController {
    public List<String> datalist = new ArrayList<String>(Arrays.asList("one", "two", "three"));
    
    @RequestMapping("/getData")
    public Info getData(@RequestParam(value = "id", defaultValue = "0") Integer id){
        return new Info(id, datalist.get(id));
        
    }
    
    @RequestMapping("/students")
    public List<Student> studentList(){
    	List<Student> list = new ArrayList<Student>();
    	list.add(new Student(1, "Mina", "Youssef", "Male", "77077"));
    	list.add(new Student(2, "Alex", "Mina", "Male", "77075"));
    	list.add(new Student(3, "Max", "Robert", "Male", "70071"));
    	list.add(new Student(4, "Layla", "John", "Female", "70004"));
    	list.add(new Student(5, "Ranna", "Maged", "Female", "75008"));
    	
    	return list;
    }
    @RequestMapping("/studentId")
    public Student studentId(@RequestParam(value = "id", defaultValue = "1") Integer id){
    	Student student = null;
    	for (Student st : studentList()) {
    		if(st.getId() == id) {
    			student = st;
    		}
    	}
    	return student;
    }
    
}

