import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Poker extends Deck {

    private static final Logger logger = LoggerFactory.getLogger(Poker.class);

    public static void main(String[] args) {

        try {
            Deck.createDeck();
            {       //создание колоды карт
                if (noOfCards < 0) {
                    throw new NegativeArraySizeException("The number of players is negative");
                }
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            logger.error(arrayIndexOutOfBoundsException.getMessage());
        } catch (ArrayStoreException arrayStoreException) {
            logger.error(arrayStoreException.getMessage());
        }
        try {
            Deck.shuffleDeck();
            {      //перетасовка колоды карт
                if (noOfCards < 0) {
                    throw new NegativeArraySizeException("The number of players is negative");
                }
            }

        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            logger.error(arrayIndexOutOfBoundsException.getMessage());
        } catch (ArrayStoreException arrayStoreException) {
            logger.error(arrayStoreException.getMessage());
        }
        try {
            Deck.serveDeck();
            {        //раздать карты на руки игрокам
                if (noOfCards < 0) {
                    throw new NegativeArraySizeException("The number of players is negative");
                }
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            logger.error(arrayIndexOutOfBoundsException.getMessage());
        } catch (ArrayStoreException arrayStoreException) {
            logger.error(arrayStoreException.getMessage());

        }
    }
}