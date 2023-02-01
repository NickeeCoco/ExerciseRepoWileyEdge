/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classrosterfull.dao;

import com.sg.classrosterfull.entities.Course;
import com.sg.classrosterfull.entities.Student;
import com.sg.classrosterfull.entities.Teacher;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
