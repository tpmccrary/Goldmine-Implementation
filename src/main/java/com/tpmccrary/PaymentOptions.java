package com.tpmccrary;

public class PaymentOptions {
    
    private double _amountDue;
    private String _paymentDate;

    public boolean payAmount(double payment)
    {
        if (_amountDue - payment < 0)
        {
            return false;
        }

        _amountDue = _amountDue - payment;

        return true;
    }

    public double getAmountDue() {
        return _amountDue;
    }

    public void setAmountDue(double amountDue) {
        this._amountDue = amountDue;
    }

    public String getPaymentDate() {
        return _paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this._paymentDate = paymentDate;
    }

    
}
