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

    // Aggregation with FinancialAid.
    private FinancialAid _financialAid;

    // Composition with PaymentOptions.
    private PaymentOptions _paymentOptions;

    public Student(int id, String name, String birthDate, FinancialAid financialAid) {
        // Inheritance of Person.
        super(id, name, birthDate);
        this._studentRecords = new StudentRecords();
        this._financialAid = financialAid;
        this._paymentOptions = new PaymentOptions();
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

    public FinancialAid getFinancialAid() {
        return _financialAid;
    }

    public void setFinancialAid(FinancialAid financialAid) {
        this._financialAid = financialAid;
    }

    public PaymentOptions getPaymentOptions() {
        return _paymentOptions;
    }

    public void setPaymentOptions(PaymentOptions paymentOptions) {
        this._paymentOptions = paymentOptions;
    }

    
    
    
}
