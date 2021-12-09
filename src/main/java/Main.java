/*

1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.


2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.

Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"piaget", "relock", "apicad", "armied", "arzava", "asmear", "bemuck", "bjorne",
                "chicky", "amidid", "darryl", "giglet", "amidid", "petrel",
                "pleion", "relock", "skiter", "soleus", "spoony", "relock"};

        System.out.println("Задание 1");
        System.out.print("Исходный массив\n");
        for (String str : arr) {
            System.out.print(str + ' ');
        }

        HashMap<String, Integer> countMap = new HashMap<String, Integer>();


        for (String str : arr) {
            if (countMap.get(str) == null) {
                countMap.put(str, 1);
            } else {
                countMap.put(str, countMap.get(str) + 1);
            }

        }
        System.out.println("\nПодсчёт кол-ва слов(слово=кол-во повторений в массиве):\n" + countMap);

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, arr);
        System.out.println("Cписок уникальных слов:\n" + set);


        System.out.println("-----------------------------------------");
        System.out.println("Задание 2");
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.add("79105623899","Glagolev");
        directory.add("79999999999","Petrov");
        directory.add("79655626869","Petrov");
        directory.add("79656685566","Mixailov");
        directory.add("79999999999","Mixailov");
        directory.add("79688995266","Mixailov");
        directory.add("79684125326","Zaharov");
        directory.add("77777777777","Petrov");
        System.out.print("Все номера и абоненты: ");
        directory.showDirectory();
        System.out.println("Номера телефонов абонентов с фамилией Петров:");
        directory.get("Petrov");
        System.out.println("Номера телефонов абонентов с фамилией Михайлов:");
        directory.get("Mixailov");
    }


}
