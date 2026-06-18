package org.example.models;

import org.example.Main;
import org.example.enums.PieceType;

import javax.naming.InsufficientResourcesException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Player {
    private final PieceType piece;
    private final String name;

    public Player(String name, PieceType piece) {
        this.piece = piece;
        this.name = name;
    }

    public PieceType getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }




}

class Solution {

    Map<String, Integer> dp;
    public int minRemovals(int[] nums, int target) {
        dp = new HashMap<>();
        return countMin(0, nums, 0, target);
    }

    int countMin(int idx, int[] nums, int xsf, int target) {
        if(idx == nums.length) {
            if(xsf == target) {
                return 0;
            } else {
                return -1;
            }
        }

        String key = idx + "#" + xsf;
        if(dp.containsKey(key)) return dp.get(key);

        int include = countMin(idx + 1, nums, xsf ^ nums[idx], target);
        int exclude = countMin(idx + 1, nums, xsf, target);

        int ans = 0;
        if(include == -1) {
            ans = exclude == -1 ? -1 : exclude + 1;
            dp.put(key, ans);
            return ans;
        }

        if(exclude == -1) {
            ans = include;
            dp.put(key, ans);
            return ans;
        }

        ans = Math.min(include, exclude + 1);
        dp.put(key, ans);
        return ans;
    }


    TreeSet<Integer> even = new TreeSet<>();
    TreeSet<Integer> odd = new TreeSet<>();
    public boolean uniformArray(int[] nums1) {
        for(int num : nums1) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        return makeAllEven(nums1) || makeAllOdd(nums1);
    }

    public boolean makeAllEven(int[] nums) {
        for(int num : nums) {
            if(num % 2 == 1) {
                Integer lower = odd.lower(num);
                if(lower == null) return false;
            }
        }
        return true;
    }

    public boolean makeAllOdd(int[] nums) {
        for(int num : nums) {
            if(num % 2 == 0) {
                Integer lower = even.lower(num);
                if(lower == null) return false;
            }
        }
        return true;
    }
}