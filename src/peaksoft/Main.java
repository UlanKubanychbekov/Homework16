package peaksoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rad = scanner.nextInt();

        Circle circle = new Circle();
        Circle.area(rad);
        Circle.circumference(rad);

    }

}
