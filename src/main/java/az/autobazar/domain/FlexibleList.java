package az.autobazar.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class FlexibleList extends AutoBazarBase implements Serializable {
    private static final long serialVersionUID = 7580411403133635514L;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlexibleList that = (FlexibleList) o;
        return id == that.id &&  name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

