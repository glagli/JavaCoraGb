public class ArrayFunctions {

    public static boolean isNumeric(String str) {
        try {
            Integer d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void arraySum(String[][] arr) {
        try {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    c += 1;
                }
            }
            if (c == 16) {
                int summ = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        if (isNumeric(arr[i][j])) {
                            summ += Integer.parseInt(arr[i][j]);
                        } else {
                            throw new MyArrayDataException("Невозможно перевести в число ячейку - " +
                                    "" + "["+i+"]" + "["+j+"]");
                        }
                    }
                }
                System.out.println("Сумма всех чисел в массиве = " + summ);
            } else {
                throw new MyArraySizeException("На входе неверный размер массива");
            }

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());

        }
    }
}
