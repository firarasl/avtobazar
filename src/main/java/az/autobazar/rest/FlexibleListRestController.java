package az.autobazar.rest;

import az.autobazar.domain.FlexibleList;
import az.autobazar.domain.FlexibleListItem;
import az.autobazar.service.FlexibleListService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = {"http://localhost:63342", "http://localhost:8080"})
@RequestMapping("/rest/flexible-list/")
@RestController
public class FlexibleListRestController {
    Logger logger = Logger.getLogger(FlexibleListRestController.class);

    @Autowired
    private FlexibleListService service;

    @GetMapping("/")
    public List<FlexibleList> getAllFlexibleList() {
        return service.getFlexibleList();
    }


    @GetMapping("/{id}")
    public List<FlexibleListItem> getFlexibleListItems(
            @PathVariable(name = "id") long id) {
        return service.getFlexibleListItems(id);
    }

    @GetMapping("/item/{id}")
    public FlexibleListItem getFlexibleListItemById(
            @PathVariable(name = "id") long id
    ) {
        Optional<FlexibleListItem> optional = service.getFlexibleListItem(id);
        FlexibleListItem item = null;

        if(optional.isPresent()) {
            item = optional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "flexible list item with id " + id + " not found!");
        }

        return item;
    }

    @PostMapping("/item")
    public void addFlexibleListItem(@RequestBody FlexibleListItem item) {
        System.out.println("add new item " + item);
        try {
            service.addFlexibleListItem(item);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error adding new item id = " + item.getId());
        }
    }

    @PutMapping("/item") //
    public void addOrUpdateFlexibleList(@RequestBody FlexibleListItem item) {
        System.out.println("add or update item " + item);
        try {
            Optional<FlexibleListItem> optional = service.getFlexibleListItem(item.getId());
            if (optional.isPresent()) {
                // todo update item
                System.out.println("update item");
                service.updateFlexibleListItem(item);
            } else {
                // todo insert item
                System.out.println("add new item");
                service.addFlexibleListItem(item);
            }
        } catch (Exception e) {
            String message = "Error add/update item " + item;
            logger.error(message, e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, message);
        }
    }

    @DeleteMapping("/item/{id}")
    public void deleteFlexibleListItem(@PathVariable(name = "id") long id) {
        System.out.println("delete item id " + id);
        // todo delete item
        service.deleteFlexibleListItem(id);
    }

}
