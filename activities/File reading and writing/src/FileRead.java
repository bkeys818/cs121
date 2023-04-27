//******************************************************************
//  Activity 10
//  Name: Ben Keys
//  Data Structures Date: 02/07/2023
//******************************************************************
//  Reads values in `courses.tsv`.
//******************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("courses.tsv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
