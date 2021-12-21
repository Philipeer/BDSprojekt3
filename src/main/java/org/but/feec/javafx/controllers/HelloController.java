package org.but.feec.javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.but.feec.javafx.App;
import org.but.feec.javafx.api.EmployeeBasicView;
import org.but.feec.javafx.api.EmployeeDetailView;
import org.but.feec.javafx.config.DataSourceConfig;
import org.but.feec.javafx.exceptions.ExceptionHandler;
import org.but.feec.javafx.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import org.but.feec.javafx.data.EmployeeRepository;

import java.io.IOException;
import java.util.List;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private TableView<EmployeeBasicView> employeeTableView;

    @FXML
    private TableColumn<EmployeeBasicView, Long> employeeID;

    @FXML
    private TableColumn<EmployeeBasicView, String> employeeName;

    @FXML
    private TableColumn<EmployeeBasicView, String> employeeSurname;

    @FXML
    private TableColumn<EmployeeBasicView, String> employeeMail;

    @FXML
    private TableColumn<EmployeeBasicView, String> employeeBuilding;

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;

    @FXML
    private void initialize() {
        employeeRepository = new EmployeeRepository();
        //personService = new PersonService(employeeRepository);
//        GlyphsDude.setIcon(exitMenuItem, FontAwesomeIcon.CLOSE, "1em");

        employeeID.setCellValueFactory(new PropertyValueFactory<EmployeeBasicView, Long>("employee_id"));
        employeeName.setCellValueFactory(new PropertyValueFactory<EmployeeBasicView, String>("first_name"));
        employeeMail.setCellValueFactory(new PropertyValueFactory<EmployeeBasicView, String>("mail"));
        employeeSurname.setCellValueFactory(new PropertyValueFactory<EmployeeBasicView, String>("surname"));
        employeeBuilding.setCellValueFactory(new PropertyValueFactory<EmployeeBasicView, String>("building_name"));


        ObservableList<EmployeeBasicView> observableEmployeesList = initializeEmployeesData();
        employeeTableView.setItems(observableEmployeesList);

        employeeTableView.getSortOrder().add(employeeID);

        initializeTableViewSelection();
        //loadIcons();

        logger.info("PersonsController initialized");
    }

    private void initializeTableViewSelection() {
        MenuItem edit = new MenuItem("Edit employee");
        MenuItem detailedView = new MenuItem("Detailed employees view");

        edit.setOnAction((ActionEvent event) -> {
            EmployeeBasicView personView = employeeTableView.getSelectionModel().getSelectedItem();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(App.class.getResource("/org/but/feec/javafx/fxml/edit.fxml"));
                Stage stage = new Stage();
                stage.setUserData(personView);
                stage.setTitle("BDS JavaFX Edit Employee");

                EditController controller = new EditController();
                controller.setStage(stage);
                fxmlLoader.setController(controller);

                Scene scene = new Scene(fxmlLoader.load(), 600, 500);

                stage.setScene(scene);

                stage.show();
            } catch (IOException ex) {
                ExceptionHandler.handleException(ex);
            }
        });

        detailedView.setOnAction((ActionEvent event) -> {
            EmployeeBasicView employeeView = employeeTableView.getSelectionModel().getSelectedItem();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(App.class.getResource("/org/but/feec/javafx/fxml/detail.fxml"));
                Stage stage = new Stage();

                Long employeeId = employeeView.getEmployee_id();
                EmployeeDetailView employeeDetailView = employeeRepository.findEmployeeDetailedView(employeeId);

                stage.setUserData(employeeDetailView);
                stage.setTitle("Employees Detailed View");

                DetailController controller = new DetailController();
                controller.setStage(stage);
                fxmlLoader.setController(controller);

                Scene scene = new Scene(fxmlLoader.load(), 600, 500);

                stage.setScene(scene);

                stage.show();
            } catch (IOException ex) {
                ExceptionHandler.handleException(ex);
            }
        });
        ContextMenu menu = new ContextMenu();
        menu.getItems().add(edit);
        menu.getItems().addAll(detailedView);
        employeeTableView.setContextMenu(menu);

    }

    public void handleAddEmployeeButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("/org/but/feec/javafx/fxml/create.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("BDS JavaFX Create Employee");
            stage.setScene(scene);

//            Stage stageOld = (Stage) signInButton.getScene().getWindow();
//            stageOld.close();
//
//            stage.getIcons().add(new Image(App.class.getResourceAsStream("logos/vut.jpg")));
//            authConfirmDialog();

            stage.show();
        } catch (IOException ex) {
            ExceptionHandler.handleException(ex);
        }
    }

    public void handleRefreshBtn(ActionEvent actionEvent) throws SQLException {
        logger.info("Database refreshed!");
        DataSourceConfig.getConnection();
        ObservableList<EmployeeBasicView> observablePersonsList = initializeEmployeesData();
        employeeTableView.setItems(observablePersonsList);
        employeeTableView.refresh();
        employeeTableView.sort();
    }

    private ObservableList<EmployeeBasicView> initializeEmployeesData() {
        List<EmployeeBasicView> persons = employeeRepository.getEmployeesBasicView();
        return FXCollections.observableArrayList(persons);
    }
}