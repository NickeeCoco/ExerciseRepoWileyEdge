/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classes_objects.dvdlibrary.dao;

import com.sg.classes_objects.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface DVDLibraryDao {
    /**
     * Adds the given Student to the roster and associates it with the given
     * student id. If there is already a student associated with the given
     * student id it will return that student object, otherwise it will
     * return null.
     *
     * @param dvdId id with which student is to be associated
     * @param dvd student to be added to the roster
     * @return the Student object previously associated with the given  
     * student id if it exists, null otherwise
     */
    DVD addDVD(String dvdId, DVD dvd);

    /**
     * Returns a List of all DVDs in the library.
     *
     * @return List containing all DVDs in the library.
     */
    List<DVD> getAllDVDs();

    /**
     * Returns the DVD object associated with the given DVD id.
     * Returns null if no such DVD exists
     *
     * @param dvdId ID of the DVD to retrieve
     * @return the DVD object associated with the given DVD id,  
     * null if no such DVD exists
     */
    DVD getDVD(String dvdId);

    /**
     * Removes from the library the DVD associated with the given id.
     * Returns the DVD object that is being removed or null if
     * there is no DVD associated with the given id
     *
     * @param dvdId id of DVD to be removed
     * @return DVD object that was removed or null if no DVD
     * was associated with the given DVD id
     */
    DVD removeDVD(String dvdId);
    
    /**
     * Search the library for DVDs containing the query in the title.
     * Returns a list of DVD objects or null if there is no DVD corresponding
     * to the given query.
     * @param title user query for search
     * @return a List of DVD objects that correspond to the search or null if no 
     * DVD was associated with the given title query.
     */
    List<DVD> searchByTitle(String title);
    
    /**
     * Edit the fields of a DVD in the library.
     * Returns the edited DVD object.
     * @param dvdId Id of the DVD to edit.
     * @return the edited DVD or null if no DVD was associated with the ID.
     */
    DVD editDVD(String dvdId);
}
