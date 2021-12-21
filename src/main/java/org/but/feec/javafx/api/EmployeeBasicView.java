package org.but.feec.javafx.api;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class EmployeeBasicView {

    private LongProperty employee_id = new SimpleLongProperty();
    private StringProperty building_name = new SimpleStringProperty();
    private StringProperty mail = new SimpleStringProperty();
    private StringProperty first_name = new SimpleStringProperty();
    private StringProperty surname = new SimpleStringProperty();

    public String getBuilding_name() {
        return building_name.get();
    }

    public StringProperty building_nameProperty() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name.set(building_name);
    }

    public long getEmployee_id() {
        return employee_id.get();
    }

    public LongProperty employee_idProperty() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id.set(employee_id);
    }

    public String getMail() {
        return mail.get();
    }

    public StringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getFirst_name() {
        return first_name.get();
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }
}
