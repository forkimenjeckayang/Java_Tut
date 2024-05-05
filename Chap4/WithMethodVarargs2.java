package Chap4;

public class WithMethodVarargs2 {

    public static void main(String[] args) {
        walk(1); // with vargs u can pass just the other parameters without pass it's own but an array of length zero will be created
        walk(1, 2); // outputs 1 cuz 2 is the only element in the array nums
        walk(1, 2, 3); //outputs 2 cuz 2 and 3 is the are only elemnets in the array nums
        walk(1, new int[] {4, 5}); // outputs 2 cuz 4 and 5 are the are only elements in the array nums

        run(new int[] {1, 2, 3}); // outputs 2 since it is at index 1
        run(11, 22); //outputs 22 since an array of  lenth 2 is created with 11 and 22 as elements

        
        
    }


    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }
    public static void run(int... nums) {
        System.out.println(nums[1]);
     }
}