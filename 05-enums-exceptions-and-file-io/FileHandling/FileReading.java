package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of file that you want to read: ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        } catch(FileNotFoundException exp){
            System.out.printf("%s file is not found", fileName);
        } catch(IOException exp){
            System.out.print("Exception Occurred");
        }
        sc.close();
    }
    
}
