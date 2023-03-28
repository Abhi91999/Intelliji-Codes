package com.example.codingpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingUserActiveMinutes {
    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> userToMinutes = new HashMap<>();
        for (int[] log : logs) {
            var minutes = userToMinutes.getOrDefault(log[0], new HashSet<>());
            minutes.add(log[1]);
            userToMinutes.put(log[0], minutes);
        }

        int[] res = new int[k];
        for (int userId : userToMinutes.keySet()) {
            res[userToMinutes.get(userId).size() - 1]++;
        }
        return res;
    }
        public static void main(String[] args) {
            int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
            int k = 5;
            int[] res = findingUsersActiveMinutes(logs,k);
            for(int i=0;i<res.length;i++)
                System.out.println(res[i]);
    }
}
