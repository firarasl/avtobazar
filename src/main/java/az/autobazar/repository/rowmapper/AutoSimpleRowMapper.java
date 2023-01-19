package az.autobazar.repository.rowmapper;

import az.autobazar.domain.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class AutoSimpleRowMapper implements RowMapper<Auto> {

    /*a.id auto_id, b.name marka, m.name model, a.year il, a.mileage km, a.engine engine, " +
            "c.name city, a.create_date create_date*/

    @Override
    public Auto mapRow(ResultSet rs, int i) throws SQLException {

        Auto auto = new Auto();

        auto.setId(rs.getLong("auto_id"));
        auto.setModel(new Model(rs.getString("model")));
        auto.getModel().setBrand(new Brand(rs.getString("marka")));
        auto.setYear(rs.getInt("il"));
        auto.setMileage(rs.getLong("km"));
        auto.setEngine(rs.getDouble("engine"));
        auto.setCity(new City(rs.getString("city")));
        auto.setCreateDateTime(rs.getTimestamp("create_date").toLocalDateTime());

        return auto;
    }
}
