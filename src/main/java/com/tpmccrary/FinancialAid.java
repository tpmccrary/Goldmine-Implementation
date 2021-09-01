package com.tpmccrary;

/**
 * Class represents financial aid.
 */
public class FinancialAid {
    
    private String _awardInfo;
    private boolean _eligable;
    private String _status;

    public String getAwardInfo() {
        return _awardInfo;
    }

    public void setAwardInfo(String awardInfo) {
        this._awardInfo = awardInfo;
    }

    public boolean isEligable() {
        return _eligable;
    }

    public void setEligable(boolean eligable) {
        this._eligable = eligable;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        this._status = status;
    }

    
}
