package com.jersey.students.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.students.pojo.Student;

public class StudentService {
 
 static HashMap<Integer,Student> studentIdMap=getStudentIdMap();
 
 
 public StudentService() {
  super();
 
  if(studentIdMap==null)
  {
   studentIdMap=new HashMap<Integer,Student>();
  // Creating some objects of Student while initializing
   Student Student1=new Student("Dinesh", 1, "Salem","Sridhar");
   Student Student2=new Student("Kumar", 2, "Chennai","Murali");
   Student Student3=new Student("Murali", 3, "Trichy","NoName");
   Student Student4=new Student("Chitra", 4, "Kerala","ManyNames");
 
 
   studentIdMap.put(1,Student1);
   studentIdMap.put(2,Student2);
   studentIdMap.put(3,Student3);
   studentIdMap.put(4,Student4);
  }
 }
 
 public List getAllStudents()
 {
  List countries = new ArrayList(studentIdMap.values());
  return countries;
 }
 
 public static Student getStudent(int id)
 {
  Student student= studentIdMap.get(id);
  return student;
 }
 public static Student addStudent(Student student)
 {
  student.setEnrollNo(studentIdMap.size()+1);
  studentIdMap.put(student.getEnrollNo(), student);
  return student;
 }
 
 public Student updateStudent(Student student)
 {
  if(student.getEnrollNo()<=0)
   return null;
  studentIdMap.put(student.getEnrollNo(), student);
  return student;
 
 }
 public void deleteStudent(int id)
 {
  studentIdMap.remove(id);
 }
 
 public static HashMap<Integer, Student> getStudentIdMap() {
  return studentIdMap;
 }
}