/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.dvdlibrary.dto;

import java.time.LocalDate;

/**
 *
 * @author Nickee Coco
 */
public class DVD {
    public static enum MPAARating {
        G, PG, PG_13, R, NC_17
    }
    
    private String id;
    private String title;
    private String releaseDate; // change to local date
    private String directorName;
    private String studio;
    private MPAARating MPAARating;
    private double userRating;
    private String userComment;

    public DVD(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MPAARating getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(MPAARating MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }
    
}
