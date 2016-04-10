package nl.groot.arenadraft.bo.enums;

/**
 * Created by Joris on 09-Apr-16.
 */
public enum SetEnum {

    Basic("basic"),
    Classic("classic"),
    Reward("reward"),
    Naxxramax("naxxramas"),
    GvG("goblins vs gnomes"),
    BRM("black rock mountain"),
    GrandTournament("grand tournament"),
    LoE("league of explorers");

    private final String name;

    SetEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
