package az.autobazar.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlexibleListItem extends AutoBazarBase implements Serializable {
    private static final long serialVersionUID = -1811943540566555331L;

    private long listId;
    private long valueId;
    private String valueName;
    private Map<Integer, Integer> extraColumnInteger;
    private Map<Integer, BigDecimal> extraColumnDecimal;
    private Map<Integer, String> extraColumnString;
//    private Map<Integer, LocalDate> extraColumnDate;
//    private Map<Integer, LocalDateTime> extraColumnTimestamp;

    public FlexibleListItem() {
        this.extraColumnInteger = new HashMap<>();
        this.extraColumnDecimal = new HashMap<>();
        this.extraColumnString = new HashMap<>();
    }

    public Map<Integer, Integer> getExtraColumnInteger() {
        return extraColumnInteger;
    }

    public void setExtraColumnInteger(Map<Integer, Integer> extraColumnInteger) {
        this.extraColumnInteger = extraColumnInteger;
    }

    public Map<Integer, BigDecimal> getExtraColumnDecimal() {
        return extraColumnDecimal;
    }

    public void setExtraColumnDecimal(Map<Integer, BigDecimal> extraColumnDecimal) {
        this.extraColumnDecimal = extraColumnDecimal;
    }

    public Map<Integer, String> getExtraColumnString() {
        return extraColumnString;
    }

    public void setExtraColumnString(Map<Integer, String> extraColumnString) {
        this.extraColumnString = extraColumnString;
    }

//    public Map<Integer, LocalDate> getExtraColumnDate() {
//        return extraColumnDate;
//    }
//
//    public void setExtraColumnDate(Map<Integer, LocalDate> extraColumnDate) {
//        this.extraColumnDate = extraColumnDate;
//    }
//
//    public Map<Integer, LocalDateTime> getExtraColumnTimestamp() {
//        return extraColumnTimestamp;
//    }
//
//    public void setExtraColumnTimestamp(Map<Integer, LocalDateTime> extraColumnTimestamp) {
//        this.extraColumnTimestamp = extraColumnTimestamp;
//    }

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public long getValueId() {
        return valueId;
    }

    public void setValueId(long valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlexibleListItem flexibleListItem = (FlexibleListItem) o;
        return id == flexibleListItem.id &&
                listId == flexibleListItem.listId &&
                valueId == flexibleListItem.valueId &&
                Objects.equals(valueName, flexibleListItem.valueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listId, valueId, valueName);
    }


}
