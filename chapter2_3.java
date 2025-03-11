package week2_pre_20237143;

import java.util.Scanner;

public class chapter2_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        int xLower = 10, yLower = 10;
        int xUpper = 200, yUpper = 300;
        
        if (x1 >= xLower && y1 >= yLower && x2 <= xUpper && y2 <= yUpper) {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (" + xLower + "," + yLower + ") (" + xUpper + "," + yUpper + ") 사각형에 포함된다.");
        } else {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (" + xLower + "," + yLower + ") (" + xUpper + "," + yUpper + ") 사각형에 포함되지 않는다.");
        }
        
        scanner.close();
    }
}
