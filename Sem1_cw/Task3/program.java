package Sem1_cw.Task3;


public class program {
    public static void main(String[] args) {
        /*
         * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
         */
        byte[] arr = new byte[] {1,1,0,1,1,1};
        // System.out.println(arr.length);
        int[] counter = new int[arr.length];
        int count = 1;
        int k=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==1 && arr[i+1]==1) {
                count++;
            }
            if ((arr[i+1]==0) || (i+1 == arr.length-1)){
                counter[k] = count;
                k++;
                count =1;
            }
        }
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max){
                max = counter[i];
                continue;
            }
        }
        System.out.print(max);

    }
}
