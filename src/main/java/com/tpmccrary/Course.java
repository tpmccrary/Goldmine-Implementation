package com.tpmccrary;
import java.util.List;
import java.util.ArrayList;

/**
 * Class represents a course.
 */
public class Course {
    
    private String _crn;
    private List<Student> _waitlist = new ArrayList<Student>();
    private String _location;
    private String _time;
    
    // Association with Student.
    private List<Student> _registeredStudents = new ArrayList<Student>();
    // Association with Professor.
    private Professor _instructor;

    public Course(String crn)
    {
        this._crn = crn;
    }

    public boolean isRegistered(int studentId)
    {
        for (Student student : _registeredStudents) {
            if (student.getId() == studentId)
            {
                return true;
            }
        }

        return false;
    }

    public boolean registerForCourse(Student student)
    {
        if (isRegistered(student.getId()) == true)
        {
            return true;
        }

        _registeredStudents.add(student);
        return true;
    }

    public boolean dropCourse(int id)
    {
        for (Student student : _registeredStudents) {
            if (student.getId() == id)
            {
                _registeredStudents.remove(student);
                return true;
            }
        }

        return false;

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

    public Professor getInstructor() {
        return _instructor;
    }

    public void setInstructor(Professor instructor) {
        this._instructor = instructor;
    }

    

}
