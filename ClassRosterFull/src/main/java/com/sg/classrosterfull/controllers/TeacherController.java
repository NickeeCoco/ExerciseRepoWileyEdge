/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classrosterfull.controllers;

import com.sg.classrosterfull.dao.TeacherDao;
import com.sg.classrosterfull.entities.Teacher;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Nickee Coco
 */

@Controller
public class TeacherController {
    
    @Autowired
    TeacherDao teacherDao;
    
    @GetMapping("teachers")
    public String displayTeachers(Model model) {
        List<Teacher> teachers = teacherDao.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "teachers";
    }
    
    @PostMapping("addTeacher")
    public String addTeacher(HttpServletRequest request) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String specialty = request.getParameter("specialty");
        
        Teacher teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setSpecialty(specialty);
        
        teacherDao.addTeacher(teacher);
        
        return "redirect:/teachers";
    }
    
    @GetMapping("deleteTeacher")
    public String deleteTeacher(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        teacherDao.deleteTeacherById(id);
        
        return "redirect:/teachers";
    }
    
    @GetMapping("editTeacher")
    public String editTeacher(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        Teacher teacher = teacherDao.getTeacherById(id);
        
        model.addAttribute("teacher", teacher);
        return "editTeacher";
    }
    
    @PostMapping("editTeacher")
    public String performEditTeacher(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Teacher teacher = teacherDao.getTeacherById(id);
        
        teacher.setFirstName(request.getParameter("firstName"));
        teacher.setLastName(request.getParameter("lastName"));
        teacher.setSpecialty(request.getParameter("specialty"));
        
        teacherDao.updateTeacher(teacher);
        
        return "redirect:/teachers";
        
    }
}
