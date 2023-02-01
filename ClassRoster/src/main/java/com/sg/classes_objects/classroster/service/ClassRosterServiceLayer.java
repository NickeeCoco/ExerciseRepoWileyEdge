/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classes_objects.classroster.service;

import com.sg.classes_objects.classroster.dao.ClassRosterPersistenceException;
import com.sg.classes_objects.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface ClassRosterServiceLayer {
    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;
 
    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;
 
    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;
 
    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
}
