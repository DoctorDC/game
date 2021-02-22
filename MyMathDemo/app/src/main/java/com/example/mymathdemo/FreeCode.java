package com.example.mymathdemo;

import java.util.HashMap;

/**
 * Created by xty on 21-2-22.
 * 有道上面记录的高频算法题
 */
public class FreeCode {
    /**
     * 无重复字符的最长子串
     * abccd 使用hashmap
     * <p>
     * 遍历字符串，
     * 将字符串存入map中
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;//长度
        //两个指针
        int i = 0; //头部
        int j = 0; //尾部
        for (; j < n; j++) {
            char a = s.charAt(j);
            if (map.containsKey(a)) {//如果map中包含a，那么移动i到j, j的位置从map中取出
                i = Math.max(map.get(a), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
