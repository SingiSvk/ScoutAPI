package sk.scout.api.scoutapi.request;

public class ExpertJsonRequest {
    private String name;
    private String level;
    private String category;
    private String focus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    @Override
    public String toString() {
        return "ExpertJsonRequest{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", category='" + category + '\'' +
                ", focus='" + focus + '\'' +
                '}';
    }
}
