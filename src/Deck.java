import java.util.Random;

public class Deck {
    public static int noOfPlayers = 4; //кол-во игроков
    public static int noOfCards = 52; // кол-во карт в колоде

    //    public static int noOfCards = -1; //java.lang.ExceptionInInitializerError
    //Caused by: java.lang.NegativeArraySizeException
    //	at Deck.<clinit>(Deck.java:6)
    //Exception in thread "main"
    private static String[] deck = new String[noOfCards]; //массив строк/элементов с кол-вом карт  = колода карт
    //private static String[] deck = new String[0] Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0

    public static void shuffleDeck() throws ArrayIndexOutOfBoundsException, ArrayStoreException, NegativeArraySizeException {
        Random random = new Random(); // берем случайные карты и меняем их местами
        for (int i = 1; i < 100; i++) {  // перетасовываем, чтобы карты не шли по порядку
            int in = random.nextInt(noOfCards); //берем 1 случайную карту из колоды и меняем их местами
            int out = random.nextInt(noOfCards); //берем ЕЩЕ 1 (всего 2) случайную карту из колоды и меняем их местами
            String card = deck[in]; //временная переменная, записываем в нее значение in
            deck[in] = deck[out];
            deck[out] = card;
        }
    }

    public static void createDeck() throws ArrayIndexOutOfBoundsException, ArrayStoreException, NegativeArraySizeException //throws Exception
    {
        String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] cardSuits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        int count = 0;
//        int count=1; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 52
        for (String suite : cardSuits) {
            for (String value : cardValues) {
                deck[count++] = String.format("%s of %s", value, suite); //добавляем в колоду созданные (объявленные ранее массивы cardValues и cardSuits) карты
//                deck[count--] = String.format("%s of %s", value, suite); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
            }
        }

    }

    public static void serveDeck() throws ArrayIndexOutOfBoundsException, ArrayStoreException, NegativeArraySizeException {//так как нужно раздать нескольким игрокам несколько карт, используем несколько циклов
        int count = 0; //чтобы брать карту из колоды НЕ случайную
        for (int round = 1; round < 7; round++) { // 1 цикл = круг раздачи
            for (int player = 1; player < noOfPlayers + 1; player++) {// проходимся по каждому игроку и даем каждому по 1 карте
                // если player > 0; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 52
                String card = deck[count++]; //берем 1 карту с индексом 0 и записываем ее значение и выдаем игроку и увеличиваем индекс на 1 до след. итерации
                System.out.printf("Player %d gets card %s%n", player, card);
            }
            System.out.println("\n\n");
        }
    }
}
