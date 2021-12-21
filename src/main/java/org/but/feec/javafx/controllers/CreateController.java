package org.but.feec.javafx.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;
import org.but.feec.javafx.api.EmployeeCreateView;
import org.but.feec.javafx.data.EmployeeRepository;
import org.but.feec.javafx.services.EmployeeService;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class CreateController {
    private static final Logger logger = LoggerFactory.getLogger(CreateController.class);

    @FXML
    public Button createButton;

    @FXML
    private TextField mailTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField surnameTextField;

    @FXML
    private PasswordField pswdTextField;

    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;
    private ValidationSupport validation;

    @FXML
    public void initialize() {
        employeeRepository = new EmployeeRepository();
        employeeService = new EmployeeService(employeeRepository);

        validation = new ValidationSupport();
        validation.registerValidator(mailTextField, Validator.createEmptyValidator("The email must not be empty."));
        validation.registerValidator(firstNameTextField, Validator.createEmptyValidator("The first name must not be empty."));
        validation.registerValidator(surnameTextField, Validator.createEmptyValidator("The last name must not be empty."));
        validation.registerValidator(pswdTextField, Validator.createEmptyValidator("The password must not be empty."));

        createButton.disableProperty().bind(validation.invalidProperty());

        logger.info("PersonCreateController initialized");
    }

    @FXML
    void handleCreateButton(ActionEvent event) {
        String email = mailTextField.getText();
        String firstName = firstNameTextField.getText();
        String lastName = surnameTextField.getText();
        String password = pswdTextField.getText();

        EmployeeCreateView employeeCreateView = new EmployeeCreateView();
        employeeCreateView.setPswd(password.toCharArray());
        employeeCreateView.setMail(email);
        employeeCreateView.setFirst_name(firstName);
        employeeCreateView.setSurname(lastName);

        employeeService.createEmployee(employeeCreateView);

        employeeCreatedConfirmationDialog();
    }

    private void employeeCreatedConfirmationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Employee Created Confirmation");
        alert.setHeaderText("Your employee was successfully created.");

        Timeline idlestage = new Timeline(new KeyFrame(Duration.seconds(3), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                alert.setResult(ButtonType.CANCEL);
                alert.hide();
            }
        }));
        idlestage.setCycleCount(1);
        idlestage.play();
        Optional<ButtonType> result = alert.showAndWait();
    }
}
