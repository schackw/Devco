package co.com.devco.certificacion.booking.models;

import java.util.List;

public class Password {

    private String password;
    private String secondPassword;

    public Password(String password, String secondPassword) {
        this.password = password;
        this.secondPassword = secondPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }
}
