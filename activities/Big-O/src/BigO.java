//******************************************************************
//  Activity 24
//  Name: Ben Keys
//  Data Structures Date: 03/15/2023
//******************************************************************
//  A class with methods that show examples of Big O notation.
//******************************************************************

public class BigO {
    public void printOnce(String msg) {
        System.out.println(msg);
    }

    public void printNTimes(String msg, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ". " + msg);
        }
    }

    public void printNSquaredTimes(String msg, int n) {
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                System.out.println(i * n + ii + 1 + ". " +msg);
            }
        }
    }
}
