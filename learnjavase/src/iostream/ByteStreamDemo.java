package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by TuanLQ on 7/17/17.
 */
public class ByteStreamDemo {
    public static void main(String[] args) {
        System.out.println("CopyFile Demo");
        if (args.length < 2) {
            System.out.println("Please provide input and output file name");
            System.exit(0);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutPutStream = new FileOutputStream(outputFile)) {


/*            int byteRead;

            while ((byteRead = fileInputStream.read()) != -1) {
                fileOutPutStream.write(byteRead);
            }*/

            // Read by chunk.

            byte[] byteRead = new byte[1024];

            while (fileInputStream.read(byteRead) != -1) {
                fileOutPutStream.write(byteRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
