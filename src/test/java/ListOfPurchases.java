import java.util.HashMap;
import java.util.Map;


    /*
Создать программу - список покупок.
В список вносится название товара и количество.
Список заполнить случайными товарами.
В конце вывести общее количество товаров, добавленных в список.
 */

    public class ListOfPurchases {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("sugar", 1);
            map.put("milk", 2);
            map.put("apple", 3);
            map.put("rice", 4);
            map.put("bread", 5);
            map.put("salt", 6);
            map.put("water", 7);
            map.put("butter", 8);
            map.put("juice", 9);
            map.put("water melon", 10);
            System.out.println("Товары, которые есть в списке --> " + map.keySet());
            System.out.println("Общее количество товаров в списке --> " + map.size());
        }
    }

