/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.sg.classes_objects.classroster;

import com.sg.classes_objects.classroster.controller.ClassRosterController;
import com.sg.classes_objects.classroster.dao.ClassRosterAuditDao;
import com.sg.classes_objects.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.sg.classes_objects.classroster.dao.ClassRosterDao;
import com.sg.classes_objects.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classes_objects.classroster.service.ClassRosterServiceLayer;
import com.sg.classes_objects.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.classes_objects.classroster.ui.ClassRosterView;
import com.sg.classes_objects.classroster.ui.UserIO;
import com.sg.classes_objects.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Nickee Coco
 */
public class App {

    public static void main(String[] args) {
        // UserIO myIo = new UserIOConsoleImpl();
        // ClassRosterView myView = new ClassRosterView(myIo);
        // ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // ClassRosterAuditDao myAuditDao = 
        //       new ClassRosterAuditDaoFileImpl();
        // ClassRosterServiceLayer myService = 
        //       new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        // ClassRosterController controller = 
        //       new ClassRosterController(myService, myView);
        // controller.run();

        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller
                = ctx.getBean("controller", ClassRosterController.class);
        controller.run();
    }
}
