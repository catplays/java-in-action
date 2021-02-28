package com.wy.action.algorithm.math;

import java.util.HashSet;
import java.util.Set;

public class ByteApp {


    public int reverseBits(int n) {
        int res = 0;
        int pow = 31;
        while (n!= 0) {
            int m = n&1;//最后一位
            res += m<<pow;
            n = n>>1;
            pow--;
        }
        return res;
    }


    /**
     * 只出现一次的数字 II
     * https://leetcode-cn.com/problems/single-number-ii/
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0, sum3 =0;
        for (int i=0; i< nums.length; i++) {
            sum3 += nums[i];
            if (set.add(nums[i])) {
                sum+= nums[i];
            }
        }
        return (sum*3 - sum3)/2;
    }

}
