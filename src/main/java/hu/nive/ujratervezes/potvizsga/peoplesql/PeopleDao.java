package hu.nive.ujratervezes.potvizsga.peoplesql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {

    DataSource dataSource;

    public PeopleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String findIpByName(String firstName, String lastName) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT `ip_address` FROM `people` WHERE `first_name` = ? AND `last_name` = ? ORDER BY `ip_address` LIMIT 1;")) {
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            try (ResultSet resultSet = statement.executeQuery()) {
                resultSet.next();
                return resultSet.getString("ip_address");
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select IP Address", se);
        }
    }

}
