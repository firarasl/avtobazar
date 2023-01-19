package az.autobazar.domain;

public class Color extends AutoBazarBase {
    private String name;
    private String css_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCss_code() {
        return css_code;
    }

    public void setCss_code(String css_code) {
        this.css_code = css_code;
    }

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    public Color(String name, String css_code) {
        this.name = name;
        this.css_code = css_code;
    }


    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", css_code='" + css_code + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
