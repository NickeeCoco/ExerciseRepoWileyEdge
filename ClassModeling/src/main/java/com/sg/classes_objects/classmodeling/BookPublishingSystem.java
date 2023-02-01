/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class BookPublishingSystem {
    private String authorName;
    private String title;
    private int numberOfChaptersWritten;
    private boolean inReview;

    public String getAuthorName() {
        return authorName;
    }

    public int getNumberOfChaptersWritten() {
        return numberOfChaptersWritten;
    }

    public void setNumberOfChaptersWritten(int numberOfChaptersWritten) {
        this.numberOfChaptersWritten = numberOfChaptersWritten;
    }

    public boolean isInReview() {
        return inReview;
    }

    public void setInReview(boolean inReview) {
        this.inReview = inReview;
    }

    public BookPublishingSystem() {
    }

    public BookPublishingSystem(String authorName, String title, int numberOfChaptersWritten, boolean inReview) {
        this.authorName = authorName;
        this.title = title;
        this.numberOfChaptersWritten = numberOfChaptersWritten;
        this.inReview = inReview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
}
