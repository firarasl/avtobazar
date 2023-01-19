package az.autobazar.service.impl;

import az.autobazar.domain.FlexibleList;
import az.autobazar.domain.FlexibleListItem;
import az.autobazar.repository.FlexibleListRepository;
import az.autobazar.service.FlexibleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlexibleListServiceImpl implements FlexibleListService {

    @Autowired
    private FlexibleListRepository repository;

    @Override
    public List<FlexibleList> getFlexibleList() {
        return repository.getFlexibleList();
    }

    @Override
    public List<FlexibleListItem> getFlexibleListItems(String listName) {
        return repository.getFlexibleListItems(listName);
    }

    @Override
    public List<FlexibleListItem> getFlexibleListItems(long listId) {
        return repository.getFlexibleListItems(listId);
    }

    @Override
    public Optional<FlexibleListItem> getFlexibleListItem(long id) {
        return repository.getFlexibleListItem(id);
    }

    @Override
    public FlexibleListItem addFlexibleListItem(FlexibleListItem item) {
        return repository.addFlexibleListItem(item);
    }

    @Override
    public boolean updateFlexibleListItem(FlexibleListItem item) {
        return repository.updateFlexibleListItem(item);
    }

    @Override
    public boolean deleteFlexibleListItem(long itemId) {
        return repository.deleteFlexibleListItem(itemId);
    }

}
