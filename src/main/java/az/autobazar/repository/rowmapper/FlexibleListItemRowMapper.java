package az.autobazar.repository.rowmapper;

import az.autobazar.domain.FlexibleListItem;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class FlexibleListItemRowMapper implements RowMapper<FlexibleListItem> {

    @Override
    public FlexibleListItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        FlexibleListItem item = new FlexibleListItem();

        item.setId(rs.getLong("id"));
        item.setListId(rs.getLong("list_id"));
        item.setValueId(rs.getLong("value_id"));
        item.setValueName(rs.getString("value_name"));

        item.setInsertDate(rs.getTimestamp("idate").toLocalDateTime());

        if(rs.getTimestamp("udate") != null) {
            item.setLastUpdate(rs.getTimestamp("udate").toLocalDateTime());
        }

        if(rs.getInt("ec_int1") != 0) {
            item.getExtraColumnInteger().put(1, rs.getInt("ec_int1") );
        }

        if(rs.getInt("ec_int2") != 0) {
            item.getExtraColumnInteger().put(2, rs.getInt("ec_int2") );
        }

        if(rs.getBigDecimal("ec_dec1") != null) {
            item.getExtraColumnDecimal().put(1, rs.getBigDecimal("ec_dec1") );
        }

        if(rs.getBigDecimal("ec_dec2") != null) {
            item.getExtraColumnDecimal().put(2, rs.getBigDecimal("ec_dec2") );
        }

        if(rs.getString("ec_str1") != null) {
            item.getExtraColumnString().put(1, rs.getString("ec_str1") );
        }

        if(rs.getString("ec_str2") != null) {
            item.getExtraColumnString().put(2, rs.getString("ec_str2") );
        }

//        if(rs.getDate("ec_date1") != null) {
//            item.getExtraColumnDate().put(1, rs.getDate("ec_date1").toLocalDate());
//        }
//
//        if(rs.getDate("ec_date2") != null) {
//            item.getExtraColumnDate().put(1, rs.getDate("ec_date2").toLocalDate());
//        }

//        if(rs.getTimestamp("ec_timestamp1") != null) {
//            item.getExtraColumnTimestamp().put(1, rs.getTimestamp("ec_timestamp1").toLocalDateTime());
//        }
//
//        if(rs.getTimestamp("ec_timestamp2") != null) {
//            item.getExtraColumnTimestamp().put(2, rs.getTimestamp("ec_timestamp2").toLocalDateTime());
//        }


        return item;
    }
}
