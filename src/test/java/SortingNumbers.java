import java.util.ArrayList;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {


        List<Integer> myNewArrayList = new ArrayList<>();
        List<Integer> myNewArrayList2 = new ArrayList<>();
        List<Integer> myNewArrayList3 = new ArrayList<>();
        List<Integer> myNewArrayListAll = new ArrayList<>();

        for (int i = 0; i < 5; i++) { // Заполнение коллекции последовательностью чисел от 0 до 100
            int a = 1; // Начальное значение диапазона - "от"
            int b = 10; // Конечное значение диапазона - "до"
            int random_number = a + (int) (Math.random() * b); // Генерация случайного числа
            myNewArrayList.add(random_number);

            if (myNewArrayList.get(i) % 2 == 0 || myNewArrayList.get(i) % 2 == 0 && myNewArrayList.get(i) % 3 == 0) {

                myNewArrayList2.add(random_number);

            }
            if (myNewArrayList.get(i) % 3 == 0 || myNewArrayList.get(i) % 2 == 0 && myNewArrayList.get(i) % 3 == 0) {

                myNewArrayList3.add(random_number);

            } else if (myNewArrayList.get(i) % 2 != 0) {

                myNewArrayListAll.add(random_number);
            }
        }
        System.out.println("Начальная коллекция из 100 случайных чисел, с границей = 500");
        System.out.println(myNewArrayList);
        System.out.println("Первая новая коллекция, состоящая из чисел, которые делятся нацело на 2 или на 2 и 3");
        System.out.println(myNewArrayList2);
        System.out.println("Вторая новая коллекция, состоящая из чисел, которые делятся нацело на 3 или на 2 и 3");
        System.out.println(myNewArrayList3);
        System.out.println("Третья новая коллекция, которая состоит из всех остальных чисел");
        System.out.println(myNewArrayListAll);
    }
}
