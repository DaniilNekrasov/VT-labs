public class Task8 {
    public static void main(String[] args) {
        int n, m, index;
        int swap;
        int[] arrA = {1,3,5,6,9,12,15,17,19};
        int[] arrB = {2,3,4,5,6, 6, 6,6,6,6,6,6,6,6,6,6,6,6,};
        n = arrA.length;
        m = arrB.length;
        index = 0;
        for (int i = 0; i < m;i++) {
            if (index < n)
            {
                if (arrA[index] > arrB[i]) {
                    System.out.print("(" + arrB[i] + ") ");
                }
                else {
                    System.out.print(arrA[index] + " ");
                    index++;
                    System.out.print("(" + arrB[i] + ") ");
                }
            }
            else
                System.out.print("(" + arrB[i] + ") ");
        }
        for (int i = index;i < n;i++)
        {
            System.out.print(arrA[i] + " ");

        }
    }
}
