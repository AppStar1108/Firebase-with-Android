package com.sitepoint.todo;

/**
 * Created by echessa on 3/10/16.
 */
public class Item {

    private String title;

    public Item() {}

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}