package com.pluralsight.restforthewicked.cerealize;

import org.springframework.stereotype.Component;

@Component  // ← Tells Spring to treat this class as a bean
public class CapnCrunch {
    String title = "Capn";
    String name = "Crunch";

    public CapnCrunch(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public CapnCrunch() {}

//region getters/setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//endregion

    @Override
    public String toString() {
        return super.toString() + " - Title: " + title + " Name: " + name;
    }
}
