// Create count hashmap - Increment the values of each character by using a put statement with the key set to the character,
// and the value set to the value of the current key (or 0 if no value) + 1
// Decrement the values using string t with the same put statement. Use character as the key, and set the value to the current value - 1
// Loop through the value of every key using map.values() to check if it is 0 - if it isnt, not an anagram
// If loop exits, return true since it is an anagram.

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        for (int amount : map.values()) {
            if (amount != 0) {
                return false;
            }
        }
        return true;
    }
}
