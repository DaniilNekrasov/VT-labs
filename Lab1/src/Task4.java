
public class Task4 {
    public static void main(String[] args) {
        int len = 10;
        int[] x = new int[len];
        for (int i = 0; i < x.length;i++)
        {
            x[i] = i;
            if (prime(x[i]))
                System.out.println(x[i] + " - простое");
        }
    }
    public static boolean prime (int x)
    {
        for(int i=2;i<=Math.sqrt(x);i++)
        if(x%i==0)
            return false;
        return true;
    }
}
