package az.autobazar.client;

import az.autobazar.client.FlexibleList;
import az.autobazar.client.FlexibleListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
public class FlexibleListApiRestTemplateImpl implements FlexibleListApiClient {

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private FlexibleListApiErrorHandler errorHandler;

    @Override
    public List<FlexibleList> getAllFlexibleList() {
        System.out.println("calling rest api get all flexible list");
        RestTemplate restTemplate = new RestTemplate();
        List<FlexibleList> allFlexibleList = restTemplate.getForObject(apiUrl, List.class);
        return allFlexibleList;
    }

    @Override
    public List<FlexibleListItem> getAllFlexibleListItemsByListId(long listId) {
        System.out.println("calling rest api get flexible list items by list id " + listId);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(errorHandler);
        List<FlexibleListItem> items = restTemplate.getForObject(apiUrl + "/" + listId, List.class);
        return items;
    }

    @Override
    public Optional<FlexibleListItem> getFlexibleListItemById(long itemId) {
        System.out.println("calling rest api get flexible list item by id " + itemId);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(errorHandler);
        FlexibleListItem item = restTemplate.getForObject(apiUrl + "item/" + itemId, FlexibleListItem.class);

        Optional<FlexibleListItem> optional = Optional.empty();
        if(item != null) {
            optional = Optional.of(item);
        }
        return optional;
    }

    @Override
    public boolean updateFlexibleListItem(FlexibleListItem item) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(errorHandler);

        System.out.println("calling update flexible list item " + item);
        System.out.println(apiUrl + "item/");

        restTemplate.put(apiUrl + "item/", item);

        return true;
    }
}
