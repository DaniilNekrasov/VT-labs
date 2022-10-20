public class Task5{
    public static void main(String[] args) {
        int len, number = 0, result, greater;
        int[] arr = {31,30,29,28,27,26,25,24,23,22};
        len = arr.length;
        result = 0;
        for (int i = 0; i < len - 1;i++)
        {
            number = 0;
            greater = 0;
            for (int j = i; j < len;j++)
            {
                if (arr[j] > greater)
                {
                    greater = arr[j];
                    number++;
                }
            }
            if (number > result)
            result = number;
        }
        System.out.println(len - result + " elements may be deleted");
    }
}