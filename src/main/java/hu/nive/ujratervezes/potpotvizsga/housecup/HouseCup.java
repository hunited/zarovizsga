package hu.nive.ujratervezes.potpotvizsga.housecup;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class HouseCup {

    private final JdbcTemplate jdbcTemplate;

    public HouseCup(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getPointsOfHouse(String house) {
        int result = 0;
        String query = "SELECT points_earned FROM house_points WHERE house_name = ?";
        List<Integer> points = jdbcTemplate.query(query, (resultSet, rowNumber) -> resultSet.getInt("points_earned"), house);
        if (points.isEmpty()) {
            throw new IllegalStateException("House not found");
        }
        for (int i : points) {
            result += i;
        }
        return result;
    }

}
