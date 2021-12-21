package org.but.feec.javafx.services;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.but.feec.javafx.api.EmployeeAuthView;
import org.but.feec.javafx.data.EmployeeRepository;
import org.but.feec.javafx.exceptions.ResourceNotFoundException;


public class AuthService {
    private EmployeeRepository employeeRepository;

    public AuthService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    private EmployeeAuthView findEmployeeByMail(String mail){
        return employeeRepository.findEmployeeByEmail(mail);
    }

    public boolean authenticate(String username, String password){
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }

        EmployeeAuthView employeeAuthView = findEmployeeByMail(username);
        if (employeeAuthView == null) {
            throw new ResourceNotFoundException("Provided username is not found.");
        }

        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), employeeAuthView.getPassword());
        return result.verified;
    }

}
