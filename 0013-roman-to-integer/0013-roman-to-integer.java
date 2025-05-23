class Solution {
    static HashMap<Character, Integer> map;
    public int romanToInt(String s) {
        int ret = 0;
        init();
        for(int i=0;i<s.length();i++) {
            if(i+1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                ret+= map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            } else {
                ret += map.get(s.charAt(i));
            }
        }
        return ret;
    }

    public void init() {
        map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
}