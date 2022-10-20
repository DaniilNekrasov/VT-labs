
public class Task3 {
    public static void main(String[] args) {
        float a, b, h;
        a = 0;
        b = 5;
        h = 1;
        for (float i = a; i <= b;i+=h)
        {
            System.out.println("F(" + i + ") = " + Math.tan(i));
        }
    }
}
