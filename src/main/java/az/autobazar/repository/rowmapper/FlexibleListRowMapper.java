package az.autobazar.repository.rowmapper;

import az.autobazar.domain.FlexibleList;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FlexibleListRowMapper implements RowMapper<FlexibleList> {
    @Override
    public FlexibleList mapRow(ResultSet rs, int rowNum) throws SQLException {
        FlexibleList flexibleList = new FlexibleList();
        flexibleList.setId(rs.getLong("id"));
        flexibleList.setName(rs.getString("name"));
        flexibleList.setInsertDate(rs.getTimestamp("idate").toLocalDateTime());

        if(rs.getTimestamp("udate") != null) {
            flexibleList.setLastUpdate(rs.getTimestamp("udate").toLocalDateTime());
        }

        flexibleList.setStatus(1);
        return flexibleList;
    }
}
