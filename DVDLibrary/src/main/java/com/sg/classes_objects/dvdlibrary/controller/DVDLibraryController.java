/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.dvdlibrary.controller;

import com.sg.classes_objects.dvdlibrary.dao.DVDLibraryDao;
import com.sg.classes_objects.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.classes_objects.dvdlibrary.dto.DVD;
import com.sg.classes_objects.dvdlibrary.ui.DVDLibraryView;
import com.sg.classes_objects.dvdlibrary.ui.UserIO;
import com.sg.classes_objects.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public class DVDLibraryController {
    
    private DVDLibraryView view = new DVDLibraryView();
    private UserIO io = new UserIOConsoleImpl();
    private DVDLibraryDao dao = new DVDLibraryDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        MenuOptions selectedMenu;

        while (keepGoing) {
            menuSelection = getMenuSelection();
            selectedMenu = MenuOptions.values()[menuSelection - 1]; // adjust to fit index 0

            switch (selectedMenu) {
                case LIST_DVDS:
                    listDVDs();
                    io.print("");
                    break;
                case ADD_DVD:
                    createDVD();
                    io.print("");
                    break;
                case EDIT_DVD:
                    io.print("EDIT DVD");
                    io.print("");
                    break;
                case DISPLAY_DVD:
                    io.print("DISPLAY DVD");
                    io.print("");
                    break;
                case SEARCH_DVD:
                    io.print("SEARCH");
                    io.print("");
                    break;
                case REMOVE_DVD:
                    io.print("REMOVE DVD");
                    io.print("");
                    break;
                case EXIT:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
                    io.print("");
            }
        }
        
        io.print("GOOD BYE");
    }
    
    private enum MenuOptions {
        LIST_DVDS, ADD_DVD, EDIT_DVD, DISPLAY_DVD, SEARCH_DVD, REMOVE_DVD, EXIT
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createDVD() {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getId(), newDVD);
        view.displayCreateSuccessBanner();
    }
    
    private void listDVDs() {
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDLibrary(dvdList);
    }
}
