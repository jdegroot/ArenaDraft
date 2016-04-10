package nl.groot.arenadraft.bo;

import java.util.HashMap;
import java.util.Map;

/**
 * Object representing a Hearthstone deck. Contains a map of all the cards and a count of the number of
 * cards in the deck.
 *
 * Created by Joris on 09-Apr-16.
 */
public class HSDeck {

    private Map<String, HSCard> deck;
    private int size;

    public HSDeck()
    {
        this.deck = new HashMap<>(30);
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Add a card to a Hearthstone deck. If the card was already in the deck, increment the count of that
     * card instead. This method also updates the size of the current deck.
     * @param card the {@link HSCard} to add to the deck
     * @return int the count of the added card in the deck
     */
    public int addCard(HSCard card)
    {
        HSCard existingCard = this.deck.get(card.getName());
        if (existingCard == null)
        {
            existingCard = card;
            existingCard.incrementDeckCount();
            this.deck.put(card.getName(), existingCard);
        }
        else
        {
            existingCard.incrementDeckCount();
        }

        this.size++;
        return existingCard.getDeckCount();
    }

    /**
     * Removes a card from the Hearthstone. If the card isn't in the deck, do nothing. If the card is in the
     * deck with a count bigger than 1, decrement the count. If the card was in the deck once, remove it
     * from the deck completely.
     * @param card the {@link HSCard} to remove from the deck
     */
    public void removeCard(HSCard card)
    {
        HSCard existingCard = this.deck.get(card.getName());
        if (existingCard != null)
        {
            if (existingCard.getDeckCount() == 1)
            {
                this.deck.remove(card.getName());
            }
            else
            {
                this.deck.get(card.getName()).decrementDeckCount();
            }
            this.size--;
        }
    }
}
