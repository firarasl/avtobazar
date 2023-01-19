package az.autobazar.repository.rowmapper;

import az.autobazar.domain.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;


@Component
public class AutoDetailedRowMapper implements RowMapper<Auto> {

    @Override
    public  Auto mapRow(ResultSet rs, int rowNum) throws SQLException {

        Auto auto = new Auto();
        auto.setUser(new User(rs.getLong("user_id"), rs.getString("user_name"), rs.getString("surname"), rs.getString("email"),"+"+rs.getString("mobile")));
        auto.setAutoShop(new AutoShop(rs.getString("autoshop")));
        auto.setDescription(rs.getString("description"));
        auto.setMedia(new Media(rs.getString("file")));
        auto.setId(rs.getLong("auto_id"));
        auto.setCity(new City(rs.getString("city_name")));
        auto.setModel(new Model(rs.getString("model")));
        auto.getModel().setBrand(new Brand(rs.getString("marka")));
        auto.setEngine(rs.getDouble("engine"));
        auto.setPrice(rs.getBigDecimal("price"));
        auto.setMileage(rs.getLong("km"));
        auto.setYear(rs.getInt("il"));
        auto.setGearType(new GearType(rs.getString("gear_type_name")));
        auto.setFuelType(new FuelType(rs.getString("fuel_type_name")));
        auto.setCurrency(new Currency(rs.getString("currency")));
        auto.setExteriorColor(new Color(rs.getString("exterior_color_name")));
        auto.setHorsePower(rs.getInt("power_horse"));
        auto.setCreateDateTime(rs.getTimestamp("create_date").toLocalDateTime());
        auto.setUsed(rs.getBoolean("used"));
        auto.setInteriorColor(new Color(rs.getString("interior_color_name")));
        auto.setAutoType(new AutoType(rs.getString("auto_type_name")));
        auto.setVinCode(rs.getString("vin_code"));
        auto.setSeat(rs.getInt("seat"));
        auto.setDoor(rs.getInt("door"));
        auto.setEuroClass(new EuroClass(rs.getString("euro_class_name")));
        auto.setClimatisation(new Climatisation(rs.getString("climatisation_name")));
        auto.setAutoPilot(rs.getBoolean("auto_pilot"));
        auto.setAirbag(rs.getBoolean("airbag"));
        auto.setLightType(new LightType(rs.getString("light_type_name")));
        auto.setParkingSensor(new ParkingSensor(rs.getString("parking_sensor_name")));
        auto.setInteriorMaterial(new InteriorMaterial(rs.getString("interior_material_name")));
        auto.setDamaged(rs.getBoolean("damaged"));
        auto.setProblem(rs.getBoolean("problem"));
        auto.setFirstOwner(rs.getBoolean("first_owner"));
        auto.setSeatAdjustment(rs.getBoolean("seat"));
        auto.setBluetooth(rs.getBoolean("bluetooth"));
        auto.setStartStop(rs.getBoolean("start_stop"));
        auto.setSideMirrorAdjustment(rs.getBoolean("mirror"));
        auto.setElectricWindow(rs.getBoolean("electric_window"));
        auto.setCentralLocking(rs.getBoolean("central_locking"));
        auto.setAbs(rs.getBoolean("abs"));
        auto.setEsp(rs.getBoolean("esp"));
        auto.setAlarm(rs.getBoolean("alarm"));
        auto.setSunroof(rs.getBoolean("sunroof"));

        return  auto;
    }
}
