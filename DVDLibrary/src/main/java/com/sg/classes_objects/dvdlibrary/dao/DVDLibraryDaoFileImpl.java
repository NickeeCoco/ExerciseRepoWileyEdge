/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.dvdlibrary.dao;

import com.sg.classes_objects.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nickee Coco
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    
    private Map<String, DVD> dvds = new HashMap<>();

    @Override
    public DVD addDVD(String dvdId, DVD dvd) {
        DVD newDVD = dvds.put(dvdId, dvd);
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<>(dvds.values());
    }

    @Override
    public DVD getDVD(String dvdId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DVD removeDVD(String dvdId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DVD> searchByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DVD editDVD(String dvdId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
