class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len_p = p.length();
        long pNum = Long.parseLong(p);
        int count = 0;
        for (int i = 0; i<= t.length() - len_p; i++){
            long subNum = Long.parseLong(t.substring(i, i + len_p));
            if(subNum <= pNum){
                count++;                
            }             
        }
        return count;
    }
}