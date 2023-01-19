package az.autobazar.client;

import az.autobazar.domain.AutoBazarBase;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlexibleList extends AutoBazarBase implements Serializable {
    private String name;
    @JsonIgnore
    private List<FlexibleListItem> flexibleListItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlexibleList() {
        this.name = "";
        this.flexibleListItems = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        az.autobazar.client.FlexibleList that = (az.autobazar.client.FlexibleList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flexibleListItems);
    }

    public List<FlexibleListItem> getFlexibleListItems() {
        return flexibleListItems;
    }

    public void setFlexibleListItems(List<FlexibleListItem> flexibleListItems) {
        this.flexibleListItems = flexibleListItems;
    }

    @Override
    public String toString() {
        return "FlexibleList{" +
                "id=" + id +
                ", name ='" + name + "'" +
                ", flexibleListItems=" + flexibleListItems +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}