package nl.groot.arenadraft.bo;


import nl.groot.arenadraft.bo.enums.ClassEnum;
import nl.groot.arenadraft.bo.enums.RarityEnum;
import nl.groot.arenadraft.bo.enums.SetEnum;

/**
 * Object representing a Hearthstone card.
 *
 * Created by Joris on 09-Apr-16.
 */
public class HSCard {

    private String id;
    private String name;
    private SetEnum set;
    private RarityEnum rarity;
    private ClassEnum clazz;

    private int deckCount;

    public HSCard() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetEnum getSet() {
        return set;
    }

    public void setSet(SetEnum set) {
        this.set = set;
    }

    public RarityEnum getRarity() {
        return rarity;
    }

    public void setRarity(RarityEnum rarity) {
        this.rarity = rarity;
    }

    public ClassEnum getClazz() {
        return clazz;
    }

    public void setClazz(ClassEnum clazz) {
        this.clazz = clazz;
    }

    public int getDeckCount() {

        return deckCount;
    }

    public void incrementDeckCount() {
        this.deckCount++;
    }

    public void decrementDeckCount()
    {
        this.deckCount--;
    }
}
