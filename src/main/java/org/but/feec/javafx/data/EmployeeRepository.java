package org.but.feec.javafx.data;

import org.but.feec.javafx.api.*;
import org.but.feec.javafx.config.DataSourceConfig;
import org.but.feec.javafx.exceptions.DataAccessException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
    //SQL INJECTION
    public List<SQLInjectionView> findByDataStatement(String data) {
        String sqlResult = "SELECT id, data FROM dummy_table d WHERE d.data = '" + data + "'";
        try (Connection connection = DataSourceConfig.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlResult)) {
            List<SQLInjectionView> sqlInjectionExampleDtos = new ArrayList<>();
            while (resultSet.next()) {
                sqlInjectionExampleDtos.add(mapToSQLInjectionExampleDto(resultSet));
            }
            return sqlInjectionExampleDtos;
        } catch (SQLException e) {
            //throw new DataAccessException("Find all users SQL failed.", e);
            System.out.println("SQL INJECTION");
        }
        return null;
    }

    private SQLInjectionView mapToSQLInjectionExampleDto(ResultSet resultSet) throws SQLException {
        SQLInjectionView sqlInjectionExampleDto = new SQLInjectionView();
        sqlInjectionExampleDto.setId(resultSet.getLong("id"));
        sqlInjectionExampleDto.setData(resultSet.getString("data"));
        return sqlInjectionExampleDto;
    }
    //////////////////////////////////////////////////////////////////////////////////////

    public EmployeeAuthView findEmployeeByEmail(String mail) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT mail, pswd" +
                             " FROM employee e" +
                             " WHERE e.mail = ?")
        ) {
            preparedStatement.setString(1, mail);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToEmployeeAuth(resultSet);
                }
            }
        } catch (SQLException e) {
            throw new DataAccessException("Find person by ID with addresses failed.", e);
        }
        return null;
    }

    public List<EmployeeBasicView> getEmployeesBasicView() {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT e.employee_id,e.first_name,e.surname,e.mail,b.building_name FROM employee e JOIN building b ON b.building_id = e.building_id; ");
             ResultSet resultSet = preparedStatement.executeQuery();) {
            List<EmployeeBasicView> employeeBasicViews = new ArrayList<>();
            while (resultSet.next()) {
                employeeBasicViews.add(mapToEmployeeBasicView(resultSet));
            }
            return employeeBasicViews;
        } catch (SQLException e) {
            throw new DataAccessException("Persons basic view could not be loaded.", e);
        }
    }

    public EmployeeDetailView findEmployeeDetailedView(Long employee_id) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT e.employee_id,e.first_name,e.surname,e.mail,b.building_name,j.job_type,a.city,a.street_number,a.street" +
                             " FROM employee e JOIN building b ON b.building_id = e.building_id" +
                             " LEFT JOIN employee_has_address eha ON eha.employee_id = e.employee_id" +
                             " LEFT JOIN address a ON a.address_id = eha.address_id" +
                             " JOIN employee_has_contract ehc ON ehc.employee_id = e.employee_id" +
                             " JOIN job j ON j.job_id = ehc.job_id" +
                             " WHERE e.employee_id = ?;")
        ) {
            preparedStatement.setLong(1, employee_id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToEmployeeDetailView(resultSet);
                }
            }
        } catch (SQLException e) {
            throw new DataAccessException("Find person by ID with addresses failed.", e);
        }
        return null;
    }

    public void createEmployee(EmployeeCreateView employeeCreateView) {
        String insertPersonSQL = "INSERT INTO employee (first_name,surname,mail,pswd) values (?,?,?,?);";
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSQL, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(3, employeeCreateView.getMail());
            preparedStatement.setString(1, employeeCreateView.getFirst_name());
            preparedStatement.setString(4, String.valueOf(employeeCreateView.getPswd()));
            preparedStatement.setString(2, employeeCreateView.getSurname());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new DataAccessException("Creating employee failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new DataAccessException("Creating employee failed operation on the database failed.");
        }
    }

    public void editEmployee(EmployeeEditView employeeEditView) { //přidělat building
        String insertPersonSQL = "UPDATE employee e SET mail = ?, first_name = ?, surname = ? WHERE e.employee_id = ?";
        String checkIfExists = "SELECT mail FROM employee e WHERE e.employee_id = ?";
        try (Connection connection = DataSourceConfig.getConnection();
             // would be beneficial if I will return the created entity back
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSQL, Statement.RETURN_GENERATED_KEYS)) {
            // set prepared statement variables
            preparedStatement.setString(1, employeeEditView.getMail());
            preparedStatement.setString(2, employeeEditView.getFirstName());
            preparedStatement.setString(3, employeeEditView.getSurname());
            preparedStatement.setLong(4, employeeEditView.getEmployee_id());

            try {
                // TODO set connection autocommit to false
                /* HERE */
                try (PreparedStatement ps = connection.prepareStatement(checkIfExists, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setLong(1, employeeEditView.getEmployee_id());
                    ps.execute();
                } catch (SQLException e) {
                    throw new DataAccessException("This employee for edit do not exists.");
                }

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows == 0) {
                    throw new DataAccessException("Creating person failed, no rows affected.");
                }
                // TODO commit the transaction (both queries were performed)
                /* HERE */
            } catch (SQLException e) {
                // TODO rollback the transaction if something wrong occurs
                /* HERE */
            } finally {
                // TODO set connection autocommit back to true
                /* HERE */
            }
        } catch (SQLException e) {
            throw new DataAccessException("Creating person failed operation on the database failed.");
        }
    }

    private EmployeeAuthView mapToEmployeeAuth(ResultSet rs) throws SQLException {
        EmployeeAuthView employee = new EmployeeAuthView();
        employee.setMail(rs.getString("mail"));
        employee.setPassword(rs.getString("pswd"));
        return employee;
    }

    private EmployeeBasicView mapToEmployeeBasicView(ResultSet rs) throws SQLException {
        EmployeeBasicView employeeBasicView = new EmployeeBasicView();
        employeeBasicView.setEmployee_id(rs.getLong("employee_id"));
        employeeBasicView.setMail(rs.getString("mail"));
        employeeBasicView.setFirst_name(rs.getString("first_name"));
        employeeBasicView.setSurname(rs.getString("surname"));
        employeeBasicView.setBuilding_name(rs.getString("building_name"));
        return employeeBasicView;
    }

    private EmployeeDetailView mapToEmployeeDetailView(ResultSet rs) throws SQLException {
        EmployeeDetailView employeeDetailView = new EmployeeDetailView();
        employeeDetailView.setEmployee_id(rs.getLong("employee_id"));
        employeeDetailView.setMail(rs.getString("mail"));
        employeeDetailView.setFirst_name(rs.getString("first_name"));
        employeeDetailView.setSurname(rs.getString("surname"));
        employeeDetailView.setBuilding_name(rs.getString("building_name"));
        employeeDetailView.setJob_type(rs.getString("job_type"));
        employeeDetailView.setCity(rs.getString("city"));
        employeeDetailView.setStreet_number(rs.getString("street_number"));
        employeeDetailView.setStreet(rs.getString("street"));
        return employeeDetailView;
    }

}
