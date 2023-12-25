class Solution {
    public int minOperations(String s) {
        int ct = 0;int ct1 = 1;
        char prev = s.charAt(0);
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)==prev)ct++;
            prev = (prev == '0') ? '1':'0';
        }
        prev = (s.charAt(0)=='0')?'1':'0';
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)==prev)ct1++;
            prev = (prev == '0') ? '1':'0';
        }
        return Math.min(ct,ct1);
    }
}
