
public class Task2 {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 0;
        if (compare(x, y))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean compare(int x, int y){
        if ((y <= 5) && (y >= 0) && (x >= -4) && (x <= 4))
            return true;
        else if ((y >= -3) && (y <= 0) && (x >= -6) && (x <= 6))
            return true;
        else
            return false;
    }
}
