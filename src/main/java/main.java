public class main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 11, 34, 54, 34, 43};
        swapArr(arr, 1, 5);
        System.out.println("-------------------------------------------------");

        System.out.println("Задание 2");
        Apple apples = new Apple(18, "red", 1);
        Apple apples2 = new Apple(10, "red", 1);
        Orange oranges = new Orange(12, "orange", 1.5);
        Orange oranges2 = new Orange(2, "orange", 1.5);


        Box<Apple> box1 = new Box<>(apples, "Коробка с яблоками №1 ");
        Box<Orange> box2 = new Box<>(oranges, "Коробка с апельсинами №1 ");
        Box<Apple> box3 = new Box<>(apples2, "Коробка с яблоками №2 ");

        System.out.println(box1.showCount());
        System.out.println(box2.showCount());
        System.out.println(box3.showCount());
        System.out.println("-------------------------------------------------");

        System.out.println("Масса коробки №1 c яблоками " + "= " + box1.getWeight());
        System.out.println("Масса коробки №1 c апельсинами " + "= " + box2.getWeight());
        System.out.println("Масса коробки №2 c яблоками " + "= " + box3.getWeight());
        System.out.println("-------------------------------------------------");

        System.out.print("Сравним коробку с яблоками №1 и коробку с апельсинами №1 : ");
        System.out.println(box1.compare(box2));
        System.out.print("Сравним коробку с яблоками №1 и коробку с яблоками №2 : ");
        System.out.println(box1.compare(box3));
        System.out.println("-------------------------------------------------");


        System.out.println("Пересыпем яблоки из коробки №1 в коробку с яблоками №2: ");
        box1.pourOver(box3);
        System.out.println(box1.showCount());
        System.out.println(box3.showCount());
        //box1.pourOver(box2); // Корзину с яблоками нельзя пересыпать в корзину с апельсинами, как и задумано
        System.out.println("-------------------------------------------------");

        System.out.println("Добавим в корзину с апельсинов в корзину");
        System.out.print("Перед добавлением: ");
        System.out.println(box2.showCount());
        box2.addFruit(oranges2);
        System.out.print("После добавления: ");
        System.out.println(box2.showCount());
        // box2.addFruit(apples2); // В корзину с апельсинами нельзя добавить яблок, как и задумано


    }

    public static void swapArr(Integer[] arr, int one, int two) {
        try {
            System.out.print("Исх. массив: ");
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println("");
            one = one - 1;
            two = two - 1;
            int container;
            container = arr[one];
            arr[one] = arr[two];
            arr[two] = container;
            System.out.print("Изм. массив: ");
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите индекс элемента внутри массива");
            System.out.println("Массив состоит из " + arr.length + " элементов\n");
        }
    }


}
