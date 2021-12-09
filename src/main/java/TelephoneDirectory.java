import java.util.HashMap;
import java.util.Objects;

public class TelephoneDirectory {
    HashMap<String, String> surnameNumber = new HashMap<>();

    public void add(String number, String surname) {
        surnameNumber.put(number, surname);
    }

    public void get(String surname) {
        for (String str : surnameNumber.keySet()) {
            if (Objects.equals(surnameNumber.get(str), surname)) {
                System.out.println(str);
            }
        }
    }

    public void showDirectory() {
        System.out.println(surnameNumber);
    }
}
