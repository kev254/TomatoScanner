package org.tensorflow.lite.examples.classification;

public class Diseaseget {

    private String disease_name;
    private String disase_Cause;
    private String disase_des;
    private String disease_treatment;

    public Diseaseget( String disease_name, String disase_Cause, String disase_des, String disease_treatment) {
        this.disease_name = disease_name;
        this.disase_Cause = disase_Cause;
        this.disase_des = disase_des;
        this.disease_treatment = disease_treatment;
    }
    public Diseaseget(){

    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public String getDisase_Cause() {
        return disase_Cause;
    }

    public void setDisase_Cause(String disase_Cause) {
        this.disase_Cause = disase_Cause;
    }

    public String getDisase_des() {
        return disase_des;
    }

    public void setDisase_des(String disase_des) {
        this.disase_des = disase_des;
    }

    public String getDisease_treatment() {
        return disease_treatment;
    }

    public void setDisease_treatment(String disease_treatment) {
        this.disease_treatment = disease_treatment;
    }



}