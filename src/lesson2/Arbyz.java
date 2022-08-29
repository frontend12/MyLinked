package lesson2;

import java.util.Scanner;

public class Arbyz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if ((w % 2) ==0){
            System.out.println("YES");
        }else {
            if ((w % 1) == 0){
                System.out.println("No");
            }
        }
    }
}
