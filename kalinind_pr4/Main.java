package kalinind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1, 2, 2, 1 ,2);
        System.out.println(circle);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.close();
       if (userInput != 1){
           circle.moveLeft();
           circle.moveDown();
       }
       else {
           circle.moveRight();
       }
        System.out.println(circle);
    }

}
