package fanur;

//Реализуйте метод checkArray(Integer[] arr),
// принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику://
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.checkArray(Arrays.asList(0, 1, 2, null, 4, 5, 6, 7));
    }
    public void checkArray(List<Integer> list) {
        boolean Exception = false;
        for (int i = 0; i < list.size(); i++) {
            var item = list.get(i);
            if (item == null) {
                Exception = true;
                System.out.println(">>> " + "Индекс №" + (i + 1) + " имеет значение null" + " <<<");
            } else
                System.out.println(item);
        }
        if (Exception) {
            throw new NullPointerException("Ошибка! Один или несколько элементов массива = null!");
        }
    }
}