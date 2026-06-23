class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        backtrack(0, digits, new StringBuilder(), ans, map);
        return ans;
    }
    private void backtrack(int index, String digits, StringBuilder curr, List<String> ans, String[] map) {
        if (index == digits.length()) {
            ans.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            curr.append(ch);
            backtrack(index + 1, digits, curr, ans, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}