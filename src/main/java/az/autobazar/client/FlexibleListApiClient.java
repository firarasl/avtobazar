package az.autobazar.client;

import az.autobazar.client.FlexibleList;
import az.autobazar.client.FlexibleListItem;

import java.util.List;
import java.util.Optional;

public interface FlexibleListApiClient {

    List<FlexibleList> getAllFlexibleList();

    List<FlexibleListItem> getAllFlexibleListItemsByListId(long listId);

    Optional<FlexibleListItem> getFlexibleListItemById(long itemId);

    boolean updateFlexibleListItem(FlexibleListItem item);

}
