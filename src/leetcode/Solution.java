package leetcode;

import java.util.*;

/**
 * @author shenhan
 * @create 2019/11/1 16:18
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int search(int[] nums, int target) {
        int ret = Arrays.binarySearch(nums, target);
        if (ret < 0) {
            return -1;
        }
        return ret;
    }

    private static int singleNonDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int num : nums) {
            list.add(num);
        }
        for (Integer integer : list) {

        }
        return 0;
    }

    private static int game(int[] guess, int[] answer) {
        int count = 0;
        if (guess[0] == answer[0]) {
            count += 1;
        }
        if (guess[1] == answer[1]) {
            count += 1;
        }
        if (guess[2] == answer[2]) {
            count += 1;
        }
        return count;
    }

    private static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort(Integer::compareTo);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            set.add(list.get(i + 1) - list.get(i));
        }
        return set.stream().max(Integer::compareTo).get();
    }

    static class Trie {

        private List<String> word = new ArrayList<>();

        /**
         * Initialize your data structure here.
         */
        public Trie() {

        }

        public List<String> getWord() {
            return word;
        }

        public void setWord(List<String> word) {
            this.word = word;
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            getWord().add(word);
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            List<String> stringList = getWord();
            if (stringList.contains(word)) {
                return true;
            }
            return false;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            List<String> stringList = getWord();
            for (String s : stringList) {
                if (s.startsWith(prefix)) {
                    return true;
                }
            }
            return false;
        }
    }

}
