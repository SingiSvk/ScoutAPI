package sk.scout.api.scoutapi.data.program.expert;

import org.springframework.lang.Nullable;
import sk.scout.api.scoutapi.data.program.Program;
import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import javax.persistence.*;

@Entity
@Table(name = "expert")
public class Expert extends Program {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Nullable
    @Column(name = "LEVEL")
    private String level;

    @Column(name = "CATEGORY")
    private String category;

    @Nullable
    @Column(name = "FOCUS")
    private String focus;

    public Expert() {
    }

    public Expert(Integer id, String name, String level, String category, String focus) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.category = category;
        this.focus = focus;
    }

    public Expert(ExpertJsonRequest request) {
        this.name = request.getName();
        this.level = request.getLevel();
        this.category = request.getCategory();
        this.focus = request.getFocus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public void setFocus(String domain) {
        this.focus = domain;
    }
}
