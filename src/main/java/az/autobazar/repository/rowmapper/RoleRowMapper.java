package az.autobazar.repository.rowmapper;

import az.autobazar.domain.Role;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class RoleRowMapper implements RowMapper<Role>{
    @Override
    public Role mapRow(ResultSet rs, int rowNum) throws SQLException {


        Role role = Role.fromValue(rs.getInt("r.id"));
        role.setSuccessPage(rs.getString("r.success_page"));
        role.setPriority(rs.getInt("r.priority"));

        return role;
    }
}
