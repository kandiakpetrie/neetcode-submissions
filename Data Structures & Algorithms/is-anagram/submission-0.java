class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        if (string1.length == string2.length){
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2) == true) return true;

        }
        return false;
    }
}