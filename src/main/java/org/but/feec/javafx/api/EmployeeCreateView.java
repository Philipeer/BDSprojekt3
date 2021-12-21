package org.but.feec.javafx.api;

import java.util.Arrays;

public class EmployeeCreateView {

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char[] getPswd() {
        return pswd;
    }

    public void setPswd(char[] pswd) {
        this.pswd = pswd;
    }

    private String mail;
    private String first_name;
    private String surname;
    private char[] pswd;

    @Override
    public String toString() {
        return "EmployeeCreateView{" +
                "mail='" + mail + '\'' +
                ", firstName='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", pswd=" + Arrays.toString(pswd) +
                '}';
    }
}
