package April;

import java.util.Stack;

public class EveryDay22 {

    /**
     * 1021. 删除最外层的括号
     * @param S
     * @return
     */
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        int start = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stringBuilder.append(S.substring(start+1, i));
                    start = i + 1;
                }
            }
        }
        return stringBuilder.toString();
    }


    /**
     * 面试题59 - I. 滑动窗口的最大值
     * @param nums
     * @param k
     * @return
     */
//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//    }
}
