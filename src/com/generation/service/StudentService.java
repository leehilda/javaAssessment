package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Person;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();


    public void subscribeStudent( Student student )
    {
        //TODO (too add student into the HashMap)
                students.put(student.getId(), student);

    }

    public Student findStudent( String studentId )
    {
       if(students.containsKey(Student.Id)){
           return students.get(Student.Id);
       }
        return null;
    }

    public boolean showSummary() {
        //TODO
        System.out.println(students);
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.println(student);
        }return false;
    }


    public void enrollToCourse(String studentId, Course course) {
        students.get(studentId).course.getCode;
    }


}
