package com.tpmccrary;

public class Person {

    private int _id;
    private String _name;
    private String _birthDate;

    public Person(int id, String name, String birthDate)
    {
        this._id = id;
        this._name = name;
        this._birthDate = birthDate;
    }

    public int getId()
    {
        return this._id;
    }

    public void setId(int givenId)
    {
        this._id = givenId;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getBirthDate() {
        return this._birthDate;
    }

    public void setBirthDate(String birthDate) {
        this._birthDate = birthDate;
    }
}
