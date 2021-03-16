package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private final DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT `name` FROM `dog_types` WHERE `country` = ? ORDER BY `name`;")) {
            statement.setString(1, country);
            return getDogsByCountry(statement);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    private List<String> getDogsByCountry(PreparedStatement statement) throws SQLException {
        List<String> dogsByCountry = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                dogsByCountry.add(name.toLowerCase());
            }
        }
        return dogsByCountry;
    }

}
