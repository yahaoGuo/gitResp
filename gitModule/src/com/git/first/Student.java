package com.git.first;

import java.util.ArrayList;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yahao
 * @Date 2020/9/13 21:41
 * @Version 1.0
 */
public class Student {
    private String name;
    public static void main(String[] args){
        int[] nums = {2,7,11,14};
        int target = 9;
        int[] array = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j] == target){
                    System.out.println(i+"--"+j);
                    list.add(i);
                    list.add(j);
                    array[0] = i;
                    array[1] = j;
                    break;
                }
            }
        }
        System.out.println(list+"数组："+array+"mums:"+nums);
    }
}
