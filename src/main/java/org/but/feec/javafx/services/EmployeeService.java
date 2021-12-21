package org.but.feec.javafx.services;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.but.feec.javafx.api.EmployeeBasicView;
//import org.but.feec.javafx.api.PersonCreateView;
//import org.but.feec.javafx.api.PersonDetailView;
//import org.but.feec.javafx.api.PersonEditView;
import org.but.feec.javafx.api.EmployeeCreateView;
import org.but.feec.javafx.api.EmployeeDetailView;
import org.but.feec.javafx.api.EmployeeEditView;
import org.but.feec.javafx.data.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public EmployeeService(){}

    public List<EmployeeBasicView> getEmployeeBasicView(){
        return employeeRepository.getEmployeesBasicView();
    }

    public EmployeeDetailView getEmployeeDetailView(Long id) {
        return employeeRepository.findEmployeeDetailedView(id);
    }

    public void editEmployee(EmployeeEditView employeeEditView) {
        employeeRepository.editEmployee(employeeEditView);
    }

    public void createEmployee(EmployeeCreateView employeeCreateView) {
        char[] originalPassword = employeeCreateView.getPswd();
        char[] hashedPassword = hashPassword(originalPassword);
        employeeCreateView.setPswd(hashedPassword);

        employeeRepository.createEmployee(employeeCreateView);
    }

    private char[] hashPassword(char[] password) {
        return BCrypt.withDefaults().hashToChar(12, password);
    }

}
