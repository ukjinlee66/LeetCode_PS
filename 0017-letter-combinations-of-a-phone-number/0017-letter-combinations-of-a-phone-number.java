import java.util.HashMap;
class Solution {
    List<String> ret = new ArrayList<String>();
    HashMap<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder());
        return digits.length() > 0 ? ret : new ArrayList<String>();
    }

    public void backtrack(String digits, int idx, StringBuilder sb) {
        if (idx == digits.length())
        {
            ret.add(sb.toString());
            return;
        }

        String letter = map.get(digits.charAt(idx));
        for (char c : letter.toCharArray()) {
            sb.append(c);
            backtrack(digits, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}