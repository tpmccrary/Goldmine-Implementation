package com.tpmccrary;
import java.util.List;
import java.util.ArrayList;


public class Course {
    
    private String _crn;
    private List<Student> _registeredStudents = new ArrayList<Student>();
    private List<Student> _waitlist = new ArrayList<Student>();
    private String _location;
    private String _time;

    public Course(String crn)
    {
        this._crn = crn;
    }

    public String getCrn() {
        return _crn;
    }
    public void setCrn(String crn) {
        this._crn = crn;
    }
    public List<Student> getRegisteredStudents() {
        return _registeredStudents;
    }
    public void setRegisteredStudents(List<Student> registeredStudents) {
        this._registeredStudents = registeredStudents;
    }
    public List<Student> getWaitlist() {
        return _waitlist;
    }
    public void setWaitlist(List<Student> waitlist) {
        this._waitlist = waitlist;
    }
    public String getLocation() {
        return _location;
    }
    public void setLocation(String location) {
        this._location = location;
    }
    public String getTime() {
        return _time;
    }
    public void setTime(String time) {
        this._time = time;
    }

    

}
