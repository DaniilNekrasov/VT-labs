public class Task7 {
    public static void main(String[] args) {
        int n;
        int swap;
        int[] arr = {11,8,13,10,4,2,15,12,10,3};
        n = arr.length;
        for (int i = 0; i < n-1;)
        {
            if (arr[i] > arr[i+1])
            {
                swap = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = swap;
                if (i != 0)
                    i--;
                else
                    i++;
            }
            else
            {
                i++;
            }
        }
        for (int i = 0; i < n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}