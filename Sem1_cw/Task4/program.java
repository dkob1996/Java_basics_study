package Sem1_cw.Task4;

public class program {
    public static void main(String[] args) {
        /*
         * 
         * Дан массив nums = [3,2,2,3] и число val = 3.
         * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
         * конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть
         * отличны от заданного, а остальные - равны ему.
         */

        int[] nums = new int[] { 3, 2, 2, 3 };
        int val = 3;
        int if_count = 0;
        int else_count = 0;
        int[] new_arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                new_arr[nums.length - 1 - if_count] = nums[i];
                if_count++;
            } else {
                new_arr[else_count] = nums[i];
                else_count++;
            }
        }

        /**
         * Next one variant with another type of sort
         * 
                for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                }
            }
        }
         * 
         */

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]);
        }
    }
}
