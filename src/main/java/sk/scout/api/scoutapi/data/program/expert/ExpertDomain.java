package sk.scout.api.scoutapi.data.program.expert;

public enum ExpertDomain {
    PRIRODA("Príroda"),
    DOBROVOLNICTVO_A_OBCIANSTVO("Dobrovoľníctvo a Občianstvo"),
    ZRUCNOSTI("Zručnosti"),
    SPORT("Šport"),
    UMENIE_A_KULTURA("Umenie a Kultúra");

    private final String domain;

    ExpertDomain(String domain) {
        this.domain = domain;
    }
}
