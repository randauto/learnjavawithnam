package iostream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by TuanLQ on 7/17/17.
 */
public class CharacterStreamDemo {
    public static void main(String[] args) {
        System.out.println("Character Stream Demo");
        if (args.length < 1) {
            System.out.println("Please provice input file name");
            System.exit(0);
        }

        try (FileReader reader = new FileReader(args[0])) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char)charRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
