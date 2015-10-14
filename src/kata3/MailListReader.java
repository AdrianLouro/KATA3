package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MailListReader {

    private final String name;

    public MailListReader(String name) {
        this.name = name;
    }

    public ArrayList<String> getDominiosArray() {
        ArrayList<String> dominiosArray = new ArrayList<>();

        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(name));
            String mail;

            while ((mail = fileIn.readLine()) != null) {
                if (mail.contains("@")) {
                    dominiosArray.add(mail.split("@")[1]);
                }
            }

        } catch (Exception e) {
            System.out.println("Fichero no existe" + e);
        }

        return dominiosArray;
    }
}
