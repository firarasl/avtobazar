package az.autobazar.repository;

import az.autobazar.domain.Auto;
import az.autobazar.domain.User;

import java.util.List;
import java.util.Optional;

public interface AutoRepository {

    Optional<Auto> getPendingAutoDetailById(long id);

    Optional<User> getUserInformationById(long id);

    List<Auto> getAutosByUserId(long id);

    Integer getCountPendingAutos();

    Integer getCountApprovedAutos();

    Integer getCountUsers();

    List<Auto> getPendingAutos(int start, int length);

    List<Auto> getApprovedAutos(int start, int length);

    List<User> getAllUsers(int start, int length);

    List<Auto> getAutoList();

    Optional<Auto> getAutoById(long id, boolean simple);

    Boolean insertBrand(String value_name, int status);

}
