package com.tpmccrary;

/**
 * Class respresents student records.
 */
public class StudentRecords {
    
    private String _transcriptFile;
    private String _grades;
    private String _taxInfo;


    public void generateTranscript(String transcript)
    {
        // Not implemented.
        // Theoretically should generate a file.
    }

    public void generateGrades(String grades)
    {
        // Not implemented.
        // Theoretically should generate a file.
    }

    public String getTranscriptFile() {
        return _transcriptFile;
    }

    public void setTranscriptFile(String transcriptFile) {
        this._transcriptFile = transcriptFile;
    }

    public String getGrades() {
        return _grades;
    }

    public void setGrades(String grades) {
        this._grades = grades;
    }

    public String getTaxInfo() {
        return _taxInfo;
    }

    public void setTaxInfo(String taxInfo) {
        this._taxInfo = taxInfo;
    }

    

}
