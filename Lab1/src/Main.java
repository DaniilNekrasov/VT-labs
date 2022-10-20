import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y, sum, div1, div2;
        x = 5;
        y = 10;
        sum = x + y;
        div1 = 1 + Math.pow(Math.sin(sum), 2);
        div2 = 2 + Math.abs(x - (2*x)/(1 + x*x*y*y));
        System.out.println(div1/div2 + x);
    }
}