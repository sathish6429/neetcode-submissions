class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {return false;}
       s = s.toUpperCase();
       t = t.toUpperCase();
       char[] chars=s.toCharArray();
       char[] chart=t.toCharArray();
       Arrays.sort(chars);
       Arrays.sort(chart);

return Arrays.equals(chars,chart);

    }
}
