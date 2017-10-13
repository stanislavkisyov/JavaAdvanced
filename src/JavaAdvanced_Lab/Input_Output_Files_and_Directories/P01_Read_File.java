package JavaAdvanced_Lab.Input_Output_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class P01_Read_File {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        String path = "\u202AC:\\Users\\pc\\Documents\\JavaLectures\\input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
