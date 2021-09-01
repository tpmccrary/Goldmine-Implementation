package com.tpmccrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a student.
 */
public class Student extends Person {

    private String _major;
    private String _classification;

    // Association with Course.
    private List<Course> _courses = new ArrayList<Course>();

    // Composition with StudentRecords.
    private StudentRecords _studentRecords;

    public Student(int id, String name, String birthDate) {
        super(id, name, birthDate);
        this._studentRecords = new StudentRecords();
    }

    public String getMajor() {
        return _major;
    }

    public void setMajor(String major) {
        this._major = major;
    }

    public String getClassification() {
        return _classification;
    }

    public void setClassification(String classification) {
        this._classification = classification;
    }

    public List<Course> getCourses() {
        return _courses;
    }

    public void setCourses(List<Course> _courses) {
        this._courses = _courses;
    }

    public StudentRecords getStudentRecords() {
        return _studentRecords;
    }

    public void setStudentRecords(StudentRecords studentRecords) {
        this._studentRecords = studentRecords;
    }

    
}
