package az.autobazar.repository.rowmapper;

import az.autobazar.domain.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Component
public class UsersRowMapperOptional implements RowMapper<Optional<User>> {

    @Override
    public Optional<User> mapRow(ResultSet resultSet, int i) throws SQLException {

        User user= new User();

        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        user.setSurname(resultSet.getString("surname"));
        user.setEmail(resultSet.getString("email"));
        user.setMobile1(resultSet.getString("mobile1"));
        user.setMobile2(resultSet.getString("mobile2"));
        user.setRegistrationDate(resultSet.getTimestamp("registration_date").toLocalDateTime());
        user.setStatus(resultSet.getInt("status"));

        return  Optional.of(user);
    }
}