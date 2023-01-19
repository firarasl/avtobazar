package az.autobazar.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AutoType extends AutoBazarBase implements Serializable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoType(String type) {
        this.type = type;
    }

    public AutoType() {
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public LocalDateTime getInsertDate() {
        return super.getInsertDate();
    }

    @Override
    public void setInsertDate(LocalDateTime insertDate) {
        super.setInsertDate(insertDate);
    }

    @Override
    public LocalDateTime getLastUpdate() {
        return super.getLastUpdate();
    }

    @Override
    public void setLastUpdate(LocalDateTime lastUpdate) {
        super.setLastUpdate(lastUpdate);
    }

    @Override
    public int getStatus() {
        return super.getStatus();
    }

    @Override
    public void setStatus(int status) {
        super.setStatus(status);
    }

    @Override
    public String toString() {
        return "AutoType{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }
}
