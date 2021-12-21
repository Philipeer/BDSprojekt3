package org.but.feec.javafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.but.feec.javafx.api.EmployeeDetailView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DetailController {

    private static final Logger logger = LoggerFactory.getLogger(DetailController.class);

    @FXML
    private TextField idTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField surnameTextField;

    @FXML
    private TextField mailTextField;

    @FXML
    private TextField buildingTextField;

    @FXML
    private TextField jobTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private TextField streetTextField;

    @FXML
    private TextField houseNumberTextField;

    public Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void initialize() {
        idTextField.setEditable(false);
        mailTextField.setEditable(false);
        firstNameTextField.setEditable(false);
        surnameTextField.setEditable(false);
        buildingTextField.setEditable(false);
        jobTextField.setEditable(false);
        cityTextField.setEditable(false);
        houseNumberTextField.setEditable(false);
        streetTextField.setEditable(false);

        loadEmployeesData();

        logger.info("DetailController initialized");
    }

    private void loadEmployeesData() {
        Stage stage = this.stage;
        if (stage.getUserData() instanceof EmployeeDetailView) {
            EmployeeDetailView employeeDetailView = (EmployeeDetailView) stage.getUserData();
            idTextField.setText(String.valueOf(employeeDetailView.getEmployee_id()));
            mailTextField.setText(employeeDetailView.getMail());
            firstNameTextField.setText(employeeDetailView.getFirst_name());
            surnameTextField.setText(employeeDetailView.getSurname());
            buildingTextField.setText(employeeDetailView.getBuilding_name());
            jobTextField.setText(employeeDetailView.getJob_type());
            cityTextField.setText(employeeDetailView.getCity());
            houseNumberTextField.setText(employeeDetailView.getStreet_number());
            streetTextField.setText(employeeDetailView.getStreet());
        }
    }

}
