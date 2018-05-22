package com.jersey.students.contoller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

import com.jersey.students.pojo.Student;
import com.jersey.students.service.StudentService;
 
 
@Path("/students")
public class StudentController {
 
 StudentService studentService=new StudentService();
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
 public List getStudents()
 {
  
  List listOfStudents=studentService.getAllStudents();
  return listOfStudents;
 }
 
    @GET
    @Path("/{enrollNo}")
    @Produces(MediaType.APPLICATION_JSON)
 public Student getStudentByEnrollNo(@PathParam("enrollNo") int enrollno)
 {
  return StudentService.getStudent(enrollno);
 }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 public Student addStudent(Student student)
 {
  return StudentService.addStudent(student);
 }
 
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
 public Student updateStudent(Student student)
 {
  return studentService.updateStudent(student);
  
 }
 
    @DELETE
    @Path("/{enrollNo}")
    @Produces(MediaType.APPLICATION_JSON)
 public void deleteStudent(@PathParam("enrollNo") int enrollno)
 {
   studentService.deleteStudent(enrollno);
  
 }
 
}