
public class Task6 {
    public static void main(String[] args) {
        int n;
        int[] arr = {11,22,33,44,55,66,77,88,99,100};
        n = arr.length;
        for (int i = 0; i < n;i++)
        {
            for (int j = 0; j < n;j++)
            {
                System.out.print(arr[(j + i)%n]+ "   ");
            }
            System.out.println();
        }
    }
}
