package az.autobazar.repository.impl;

import az.autobazar.repository.CommonRepository;
import az.autobazar.repository.SqlQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommonRepositoryImpl implements CommonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean checkEmail(String email) {
        Object[] args = new Object[]{email};
        int count = jdbcTemplate.queryForObject(SqlQuery.CHECK_EMAIL, args, Integer.class);
        return count > 0;
    }

    @Override
    public boolean checkMobile(String mobile) {
        Object[] args = new Object[]{mobile, mobile};
        int count = jdbcTemplate.queryForObject(SqlQuery.CHECK_MOBILE, args, Integer.class);
        return count > 0;
    }
}
