package com.tpmccrary;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {

    private String _highestDegree;
    private String _position;

    // Association with Course.
    private List<Course> _coursesInstructing = new ArrayList<Course>();

    public Professor(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }

    public String getHighestDegree() {
        return _highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this._highestDegree = highestDegree;
    }

    public String getPosition() {
        return _position;
    }

    public void setPosition(String position) {
        this._position = position;
    }

    public List<Course> getCoursesInstructing() {
        return _coursesInstructing;
    }

    public void setCoursesInstructing(List<Course> coursesInstructing) {
        this._coursesInstructing = coursesInstructing;
    }

}
