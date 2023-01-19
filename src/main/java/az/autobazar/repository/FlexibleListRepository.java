package az.autobazar.repository;


import az.autobazar.domain.FlexibleList;
import az.autobazar.domain.FlexibleListItem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface FlexibleListRepository {

    List<FlexibleList> getFlexibleList();
    List<FlexibleListItem> getFlexibleListItems(String listName);
    List<FlexibleListItem> getFlexibleListItems(long listId);

    Optional<FlexibleListItem> getFlexibleListItem(long id);
    FlexibleListItem addFlexibleListItem(FlexibleListItem item);
    boolean updateFlexibleListItem(FlexibleListItem item);
    boolean deleteFlexibleListItem(long itemId);





}
