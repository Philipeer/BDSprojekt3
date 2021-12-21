package org.but.feec.javafx.api;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmployeeDetailView {
    private LongProperty employee_id = new SimpleLongProperty();
    private StringProperty mail = new SimpleStringProperty();
    private StringProperty first_name = new SimpleStringProperty();
    private StringProperty surname = new SimpleStringProperty();
    private StringProperty building_name = new SimpleStringProperty();
    private StringProperty job_type = new SimpleStringProperty();
    private StringProperty city = new SimpleStringProperty();
    private StringProperty street = new SimpleStringProperty();
    private StringProperty street_number = new SimpleStringProperty();

    public String getJob_type() {
        return job_type.get();
    }

    public StringProperty job_typeProperty() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type.set(job_type);
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

    public String getBuilding_name() {
        return building_name.get();
    }

    public StringProperty building_nameProperty() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name.set(building_name);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getStreet() {
        return street.get();
    }

    public StringProperty streetProperty() {
        return street;
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public String getStreet_number() {
        return street_number.get();
    }

    public StringProperty street_numberProperty() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number.set(street_number);
    }

}
