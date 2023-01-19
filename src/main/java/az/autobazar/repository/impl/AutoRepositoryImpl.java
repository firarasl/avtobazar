package az.autobazar.repository.impl;

import az.autobazar.domain.*;
import az.autobazar.repository.AutoRepository;
import az.autobazar.repository.SqlQuery;
import az.autobazar.repository.rowmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Component
public class AutoRepositoryImpl implements AutoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    MediaByAutoIdRowMapper mediaByAutoIdRowMapper;

    @Autowired
    AutoDetailedRowMapper autoDetailedRowMapper;

    @Autowired
    AutoSimpleRowMapper autoSimpleRowMapper;

    @Autowired
    DataTableResult dataTableResult;

    @Autowired
    UsersRowMapper usersRowMapper;

    @Override
    public Optional<Auto> getPendingAutoDetailById(long id) {

        Optional<Auto> optionalAuto = Optional.empty();
        Object [] args = {id};
        List<Auto> list = jdbcTemplate.query(SqlQuery.GET_AUTO_DETAILED_BY_ID, args, autoDetailedRowMapper);
        if(list != null && !list.isEmpty()) {
            optionalAuto = Optional.of(list.get(0));
        }
        return optionalAuto;
    }


    @Override
    public Optional<User> getUserInformationById(long id) {
        Optional<User> optionalUser = Optional.empty();
        Object[] args = {id};
//        return jdbcTemplate.query((SqlQuery.GET_USER_INFORMATION_BY_ID),args, usersRowMapper);
        List<User> userList = jdbcTemplate.query(SqlQuery.GET_USER_INFORMATION_BY_ID, args, usersRowMapper);
        if (!userList.isEmpty()) {
            optionalUser = Optional.of(userList.get(0));
        }
        return optionalUser;
    }

    @Override
    public List<Auto> getAutosByUserId(long id) {
        Object[] args = {id};

        return jdbcTemplate.query(SqlQuery.GET_AUTOS_BY_USER_ID, args, autoSimpleRowMapper);
    }


    @Override
    public List<Auto> getApprovedAutos(int start, int length) {

        Object[] args = {start, length};
        return jdbcTemplate.query(SqlQuery.GET_APPROVED_AUTOS, autoSimpleRowMapper, args);
    }

    @Override
    public Integer getCountApprovedAutos() {
        return jdbcTemplate.queryForObject(SqlQuery.GET_COUNT_APPROVED_AUTOS, Integer.class);
    }

    @Override
    public Integer getCountPendingAutos() {
        return jdbcTemplate.queryForObject(SqlQuery.GET_COUNT_PENDING_AUTOS, Integer.class);
    }

    @Override
    public Integer getCountUsers() {
        return jdbcTemplate.queryForObject(SqlQuery.COUNT_ALL_USERS, Integer.class);
    }

    @Override
    public List<Auto> getPendingAutos(int start, int length) {

        Object[] args = {start, length};

        return jdbcTemplate.query(SqlQuery.GET_PENDING_AUTOS, autoSimpleRowMapper, args);
    }

    @Override
    public List<User> getAllUsers(int start, int length) {
        Object[] args = {start, length};
        return jdbcTemplate.query(SqlQuery.GET_ALL_USERS, usersRowMapper, args);
    }

    @Override
    public List<Auto> getAutoList() {







        return null;
    }

    @Override
    public Optional<Auto> getAutoById(long id, boolean simple) {
        Optional<Auto> optionalAuto = Optional.empty();

        String query = simple ? SqlQuery.GET_AUTO_SIMPLE_BY_ID : SqlQuery.GET_AUTO_DETAILED_BY_ID;
        RowMapper<Auto> rowMapper = simple ? autoSimpleRowMapper : autoDetailedRowMapper;

        List<Auto> list = jdbcTemplate.query(query, new Object[]{id}, rowMapper);
        if(list != null && !list.isEmpty()) {
            optionalAuto = Optional.of(list.get(0));
        }
        return optionalAuto;
    }


    @Override
    public Boolean insertBrand(String value_name, int status) {

        int valueId = jdbcTemplate.queryForObject(SqlQuery.GET_INCREMENTED_BRAND_ID, Integer.class);


        return jdbcTemplate.execute(SqlQuery.INSERT_NEW_BRAND, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, valueId);
                ps.setString(2, value_name);
                ps.setInt(3, status);
                return ps.execute();
            }
        });
    }
}


