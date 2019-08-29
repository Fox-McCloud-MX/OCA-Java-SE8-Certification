package edu.oca.java.se8.certification.others.questions;

public class Update {
    
    private static void update(int[] nums, int index) {
        index++;
        nums[index] = 14;
    }

    public static void main(String[] args) {
        int index = 2;
        int[] nums = {1, 3, 5, 7};
        update(nums, index);
        for (int n : nums) {
            System.out.print(n + ", ");
        }
        System.out.print(index); //1, 3, 5, 14, 2
    }
}
