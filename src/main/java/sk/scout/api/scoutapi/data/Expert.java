package sk.scout.api.scoutapi.data;

import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import javax.persistence.*;

@Entity
@Table(name = "expert")
public class Expert extends Program{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LEVEL")
    private String level;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "DOMAIN")
    private String domain;

    public Expert() {
    }

    public Expert(Integer id, String level, String category, String domain) {
        this.id = id;
        this.level = level;
        this.category = category;
        this.domain = domain;
    }

    public Expert(ExpertJsonRequest request) {
        this.level = request.getLevel();
        this.category = request.getCategory();
        this.domain = request.getDomain();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
