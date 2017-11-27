package com.mindnotix.dynamiclayoutvalidation;

/**
 * Created by Admin on 05-10-2017.
 */

public class SurchargeAddModel {

    private int selectedposition;
    private String sc_id;
    private String editTextValue;
    private String noteedittext;
    private int paidbyselectedposition;

    public String getWho_paid_by() {
        return who_paid_by;
    }

    public void setWho_paid_by(String who_paid_by) {
        this.who_paid_by = who_paid_by;
    }

    private String who_paid_by;

    public String getSc_id() {
        return sc_id;
    }

    public void setSc_id(String sc_id) {
        this.sc_id = sc_id;
    }


    public void setPaidbyselectedposition(int paidbyselectedposition) {
        this.paidbyselectedposition = paidbyselectedposition;
    }

    public int getPaidbyselectedposition() {
        return paidbyselectedposition;
    }

    public int getSelectedposition() {
        return selectedposition;
    }

    public void setSelectedposition(int selectedposition) {
        this.selectedposition = selectedposition;
    }

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }


    public String getNoteedittext() {
        return noteedittext;
    }

    public void setNoteedittext(String noteedittext) {
        this.noteedittext = noteedittext;
    }


}
