/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = sum * nums[i];
        }
        System.out.println("Произведение чисел массива: " + sum);
    }
}
