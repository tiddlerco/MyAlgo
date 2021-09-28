package stack.有效括号;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20
 * @Author 喻可
 * @Date 2021/9/27 18:29
 */
class Solution {

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};

    public boolean isValid(String s) {

        if (s.length() > 0 && !map.containsKey(s.charAt(0))) {
            return false;
        }

        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.addLast(c);
            } else if (map.get(stack.removeLast()) != c) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}

