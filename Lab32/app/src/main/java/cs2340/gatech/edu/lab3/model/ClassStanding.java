package cs2340.gatech.edu.lab3.model;
import java.io.Serializable;

/**
 * Created by Divya on 9/15/2017.
 */

public enum ClassStanding implements Serializable {
    FRESHMAN ("FR"),
    SOPHOMORE ("SO"),
    JUNIOR ("JR"),
    SENIOR ("SR");

    private String code;

    ClassStanding (String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
