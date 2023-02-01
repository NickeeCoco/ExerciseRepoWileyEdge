/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classes_objects.classroster.dao;

/**
 *
 * @author Nickee Coco
 */
public interface ClassRosterAuditDao {
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException;
}
