package az.autobazar.repository.impl;


import az.autobazar.domain.FlexibleList;
import az.autobazar.domain.FlexibleListItem;
import az.autobazar.repository.FlexibleListRepository;
import az.autobazar.repository.SqlQuery;
import az.autobazar.repository.rowmapper.FlexibleListItemRowMapper;
import az.autobazar.repository.rowmapper.FlexibleListRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;
import java.util.Optional;

@Repository
public class FlexibleListRepositoryImpl implements FlexibleListRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private FlexibleListRowMapper flexibleListRowMapper;

    @Autowired
    private FlexibleListItemRowMapper flexibleListItemRowMapper;

    @Override
    public List<FlexibleList> getFlexibleList() {
        List<FlexibleList>  list= jdbcTemplate.query(SqlQuery.GET_FLEXIBLE_LIST, flexibleListRowMapper);
//        list.forEach(fl -> fl.setFlexibleListItems(getFlexibleListItems(fl.getId())));
        return list;
    }

    @Override
    public List<FlexibleListItem> getFlexibleListItems(String listName) {
        return jdbcTemplate.query(SqlQuery.GET_FLEXIBLE_LIST_ITEMS_BY_LIST_NAME, new Object[]{listName}, flexibleListItemRowMapper);
    }

    @Override
    public List<FlexibleListItem> getFlexibleListItems(long listId) {
        return jdbcTemplate.query(SqlQuery.GET_FLEXIBLE_LIST_ITEMS_BY_LIST_ID, new Object[]{listId}, flexibleListItemRowMapper);
    }

    @Override
    public Optional<FlexibleListItem> getFlexibleListItem(long id) {
        Optional<FlexibleListItem> optional = Optional.empty();
        List<FlexibleListItem> list = jdbcTemplate.query(SqlQuery.GET_FLEXIBLE_LIST_ITEM_BY_ID, new Object[]{id}, flexibleListItemRowMapper);
        if(list != null && !list.isEmpty()) {
            optional = Optional.of(list.get(0));
        }
        return optional;
    }

    @Override
    public FlexibleListItem addFlexibleListItem(FlexibleListItem item) {

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(SqlQuery.ADD_FLEXIBLE_LIST_ITEM, Statement.RETURN_GENERATED_KEYS);

            /*
            * public static final String ADD_FLEXIBLE_LIST_ITEM = "insert into flexible_list_item(" +
                "id, list_id, value_id, value_name, " +
                "ec_int1, ec_int2, ec_int3, ec_int4, ec_int5, ec_int6,
                * ec_dec1, ec_dec2, " +
                "ec_str1, ec_str2, idate, status)" +
                "values(null, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?,
                *?, ?, " +
                "?, ?, current_timestamp(), 1)";
            * */
            ps.setLong(1, item.getListId());
            ps.setLong(2, item.getValueId());
            ps.setString(3, item.getValueName());

            // ec_int1-6
            for (int i = 0; i < 6; i++) {
                if(item.getExtraColumnInteger().containsKey(i)) {
                    ps.setInt(4 + i, item.getExtraColumnInteger().get(i + 1));
                } else {
                    ps.setNull(4 + i, Types.INTEGER);
                }
            }

            // ec_dec1,2
            for (int i = 0; i < 2; i++) {
                if(item.getExtraColumnDecimal().containsKey(i)) {
                    ps.setBigDecimal(10 + i, item.getExtraColumnDecimal().get(i + 1));
                } else {
                    ps.setNull(10 + i, Types.DECIMAL);
                }
            }

            // ec_str1,2
            for (int i = 0; i < 2; i++) {
                if(item.getExtraColumnString().containsKey(i)) {
                    ps.setString(12 + i, item.getExtraColumnString().get(i + 1));
                } else {
                    ps.setNull(12 + i, Types.VARCHAR);
                }
            }

            return ps;
        }, keyHolder);

        item.setId(keyHolder.getKey().longValue());

        return item;
    }

    @Override
    public boolean updateFlexibleListItem(FlexibleListItem item) {
       /* UPDATE_FLEXIBLE_LIST_ITEM = "update flexible_list_item" +
                "set list_id = ?, value_id = ?, value_name = ?, " +
                "ec_int1 = ?, ec_int2 = ?, ec_int3 = ?, ec_int4 = ?, ec_int5 = ?, ec_int6 = ?, " +
                "ec_dec1 = ?, ec_dec2 = ?, " +
                "ec_str1 = ?, ec_str2 = ?, udate = current_timestamp() " +
                "where id = ? and status = 1"; */
        Object[] args = new Object[] {
                item.getListId(), item.getValueId(), item.getValueName(),
                item.getExtraColumnInteger().getOrDefault(1, null),
                item.getExtraColumnInteger().getOrDefault(2, null),
                item.getExtraColumnInteger().getOrDefault(3, null),
                item.getExtraColumnInteger().getOrDefault(4, null),
                item.getExtraColumnInteger().getOrDefault(5, null),
                item.getExtraColumnInteger().getOrDefault(6, null),
                item.getExtraColumnDecimal().getOrDefault(1, null),
                item.getExtraColumnDecimal().getOrDefault(2, null),
                item.getExtraColumnString().getOrDefault(1, null),
                item.getExtraColumnString().getOrDefault(2, null),
                item.getId()
        };

        int count = jdbcTemplate.update(SqlQuery.UPDATE_FLEXIBLE_LIST_ITEM, args);
        return count > 0;
    }

    @Override
    public boolean deleteFlexibleListItem(long itemId) {
        Object[] args = new Object[]{itemId};
        int count = jdbcTemplate.update(SqlQuery.DELETE_FLEXIBLE_LIST_ITEM, args);
        return count > 0;
    }

}
