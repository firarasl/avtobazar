package az.autobazar.client;

import az.autobazar.domain.AutoBazarBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FlexibleListItem extends AutoBazarBase implements Serializable {
    private static final long serialVersionUID = 517605992787318030L;
    private long listId;
    private long valueId;
    private String valueName;
    private Map<String, Integer> extraColumnNum;
    private Map<String, BigDecimal> extraColumnDec;
    private Map<String, String> extraColumnStr;
    private Map<String, LocalDate> extraColumnDate;
    private Map<String, LocalDateTime> extraColumnTimestamp;

    public FlexibleListItem() {
        this.id = 0;
        this.listId = 0;
        this.valueId = 0;
        this.valueName = "";
        this.extraColumnNum = new HashMap<>();
        this.extraColumnDec = new HashMap<>();
        this.extraColumnStr = new HashMap<>();
        this.extraColumnDate = new HashMap<>();
        this.extraColumnTimestamp = new HashMap<>();
    }

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

    public Map<String, Integer> getExtraColumnNum() {
        return extraColumnNum;
    }

    public void setExtraColumnNum(Map<String, Integer> extraColumnNum) {
        this.extraColumnNum = extraColumnNum;
    }

    public Map<String, BigDecimal> getExtraColumnDec() {
        return extraColumnDec;
    }

    public void setExtraColumnDec(Map<String, BigDecimal> extraColumnDec) {
        this.extraColumnDec = extraColumnDec;
    }

    public Map<String, String> getExtraColumnStr() {
        return extraColumnStr;
    }

    public void setExtraColumnStr(Map<String, String> extraColumnStr) {
        this.extraColumnStr = extraColumnStr;
    }

    public Map<String, LocalDate> getExtraColumnDate() {
        return extraColumnDate;
    }

    public void setExtraColumnDate(Map<String, LocalDate> extraColumnDate) {
        this.extraColumnDate = extraColumnDate;
    }

    public Map<String, LocalDateTime> getExtraColumnTimestamp() {
        return extraColumnTimestamp;
    }

    public void setExtraColumnTimestamp(Map<String, LocalDateTime> extraColumnTimestamp) {
        this.extraColumnTimestamp = extraColumnTimestamp;
    }

    @Override
    public String toString() {
        return "FlexibleListItem{" +
                "id=" + id +
                ", listId=" + listId +
                ", valueId=" + valueId +
                ", valueName='" + valueName + '\'' +
                ", extraColumnNum=" + extraColumnNum +
                ", extraColumnDec=" + extraColumnDec +
                ", extraColumnStr=" + extraColumnStr +
                ", extraColumnDate=" + extraColumnDate +
                ", extraColumnTimestamp=" + extraColumnTimestamp +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
