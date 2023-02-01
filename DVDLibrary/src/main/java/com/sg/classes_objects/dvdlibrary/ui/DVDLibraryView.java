/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.dvdlibrary.ui;

import com.sg.classes_objects.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public class DVDLibraryView {

    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Add DVD");
        io.print("3. Edit DVD");
        io.print("4. Display DVD");
        io.print("5. Search for DVD");
        io.print("6. Remove DVD");
        io.print("7. Exit");

        return io.readInt("Please select from the above choices.", 1, 7);
    }
    
    public DVD getNewDVDInfo() {
        String dvdID = io.readString("Please enter DVD ID");
        String title = io.readString("Please enter DVD title");
        String releaseDate = io.readString("Please enter release date (DD/MM/YYYY)"); 
        io.print("Please chose MPAA Rating: ");
        int MPAAInt = io.readInt("1: G, 2: PG, 3: PG 13, 4: R, 5: NC 17", 1, 5);
        String directorName = io.readString("Please enter director's name");
        String studio = io.readString("Please enter studio name");
        double userRating = io.readDouble("Please enter your rating", 0, 5);
        String userComment = io.readString("Please enter a comment");
        
        DVD currentDVD = new DVD(dvdID);
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMPAARating(DVD.MPAARating.values()[MPAAInt - 1]); // adjust int for 0 index
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        currentDVD.setUserComment(userComment);        
        
        return currentDVD;
    }
    
    public void displayCreateDVDBanner() {
        io.print("=== Create DVD ===");
    }
    
    public void displayCreateSuccessBanner() {
        io.readString("DVD successfully created. Please hit enter to continue.");
    }
    
    public void displayDVDLibrary(List<DVD> dvdList) {
        for(DVD currentDVD : dvdList) {
            String dvdInfo = String.format("#%s : %s (%s)",
                    currentDVD.getId(),
                    currentDVD.getTitle(),
                    currentDVD.getReleaseDate().substring(6));
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }
}
