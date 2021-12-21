package org.but.feec.javafx.api;

public class EmployeeEditView {

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "EmployeeEditView{" +
                "mail='" + mail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", building_name='" + building_name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    private Long employee_id;
    private String mail;
    private String firstName;
    private String building_name;
    private String surname;
}
