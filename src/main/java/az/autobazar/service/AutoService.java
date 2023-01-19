package az.autobazar.service;

import az.autobazar.domain.Auto;
import az.autobazar.domain.DataTableResult;
import az.autobazar.domain.User;

import java.util.List;
import java.util.Optional;

public interface AutoService {

    Optional<Auto> getPendingAutoDetailById(long id);

    Optional<User> getUserInformationById(long id);

    List<Auto> getAutosByUserId(long id);

    int getCountPendingAutos();

    int getCountApprovedAutos();

    int getCountUsers();

    DataTableResult getDataTable(int draw, int start, int length);

    DataTableResult getDataTableApproved(int draw, int start, int length);

    DataTableResult getDataUsers(int draw, int start, int length);

    List<Auto> getAutoList();

    Optional<Auto> getAutoById(long id, boolean simpleRowMapper);

    Boolean insertBrand(String value_name, int status);

}
