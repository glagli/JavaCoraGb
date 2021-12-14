import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // создал HashMap для хранения тестовых данных.
        HashMap<String, String[]> lastName = new HashMap<>();
        lastName.put("LastName", new String[]{"Jones", "Kowles", "Ivanov", "Polin"});
        lastName.put("FirstName", new String[]{"Bob", "Kari", "Alice", "Vlad"});
        lastName.put("Hours", new String[]{"22", "33", "55", "44"});

        File file = new File("src/main/java/test.csv");
        if (!file.exists()) {
            throw new IOException("Файл не найден");
        }

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("src/main/java/test.csv"))) {
            // флаг для исключения проставления ; в конце строки
            int flag = 0;
            for (String s : lastName.keySet()) {
                out.writeBytes(s);
                if (flag != lastName.keySet().size() - 1) {
                    out.writeBytes("; ");
                }
                flag++;
            }
            out.writeBytes("\n");
            for (String s : lastName.keySet()) {
                // флаг для исключения проставления ; в конце строки
                int flag2 = 0;
                for (int i = 0; i < lastName.get(s).length; i++) {
                    out.writeBytes(lastName.get(s)[i]);
                    if (flag2 != lastName.get(s).length - 1) {
                        out.writeBytes("; ");
                    }
                    flag2++;
                }

                out.writeBytes("\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream("src/main/java/test.csv"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}





