package org.but.feec.javafx.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.but.feec.javafx.api.EmployeeBasicView;
import org.but.feec.javafx.api.EmployeeEditView;
import org.but.feec.javafx.data.EmployeeRepository;
import org.but.feec.javafx.services.EmployeeService;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class EditController {
    private static final Logger logger = LoggerFactory.getLogger(EditController.class);

    @FXML
    public Button editEmployeeButton;
    @FXML
    public TextField idTextField;
    @FXML
    private TextField mailTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField surnameTextField;
    //@FXML
    //private TextField buildingTextField;

    private EmployeeService emplyoeeService;
    private EmployeeRepository employeeRepository;
    private ValidationSupport validation;

    public Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void initialize() {
        employeeRepository = new EmployeeRepository();
        emplyoeeService = new EmployeeService(employeeRepository);

        validation = new ValidationSupport();
        validation.registerValidator(idTextField, Validator.createEmptyValidator("The id must not be empty."));
        idTextField.setEditable(false);
        validation.registerValidator(mailTextField, Validator.createEmptyValidator("The email must not be empty."));
        validation.registerValidator(firstNameTextField, Validator.createEmptyValidator("The first name must not be empty."));
        validation.registerValidator(surnameTextField, Validator.createEmptyValidator("The surname must not be empty."));
        //validation.registerValidator(buildingTextField, Validator.createEmptyValidator("The building must not be empty."));

        editEmployeeButton.disableProperty().bind(validation.invalidProperty());

        loadEmployeeData();

        logger.info("PersonsEditController initialized");
    }


    private void loadEmployeeData() {
        Stage stage = this.stage;
        if (stage.getUserData() instanceof EmployeeBasicView) {
            EmployeeBasicView employeeBasicView = (EmployeeBasicView) stage.getUserData();
            idTextField.setText(String.valueOf(employeeBasicView.getEmployee_id()));
            mailTextField.setText(employeeBasicView.getMail());
            firstNameTextField.setText(employeeBasicView.getFirst_name());
            surnameTextField.setText(employeeBasicView.getSurname());
            //buildingTextField.setText(employeeBasicView.getBuilding_name());
        }
    }

    @FXML
    public void handleEditEmployeeButton(ActionEvent event) {
        Long id = Long.valueOf(idTextField.getText());
        String email = mailTextField.getText();
        String firstName = firstNameTextField.getText();
        String surname = surnameTextField.getText();
        //String building = buildingTextField.getText();

        EmployeeEditView employeeEditView = new EmployeeEditView();
        employeeEditView.setEmployee_id(id);
        employeeEditView.setMail(email);
        employeeEditView.setFirstName(firstName);
        employeeEditView.setSurname(surname);
        //employeeEditView.setBuilding_name(building);

        emplyoeeService.editEmployee(employeeEditView);

        employeeEditedConfirmationDialog();
    }

    private void employeeEditedConfirmationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Employee Edited Confirmation");
        alert.setHeaderText("Your employee was successfully edited.");

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
