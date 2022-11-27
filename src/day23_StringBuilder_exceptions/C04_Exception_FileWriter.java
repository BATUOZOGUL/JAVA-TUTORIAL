package day23_StringBuilder_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C04_Exception_FileWriter {
    public static void main(String[] args) {

        try {
            writeToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void writeToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\pc\\IdeaProjects\\Maastricht\\src\\day23_StringBuilder_exceptions\\hollanda.txt"));
        bw.write("amsterdam dan merhaba");
        bw.close();
    }


}
