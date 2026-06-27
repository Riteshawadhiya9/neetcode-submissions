class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;

        HashMap<Character,Integer> mp1 = makeFreqCnt(s);
        HashMap<Character,Integer> mp2 = makeFreqCnt(t);
        return mp1.equals(mp2);
    }
    private HashMap<Character,Integer> makeFreqCnt(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
        Character ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
}
