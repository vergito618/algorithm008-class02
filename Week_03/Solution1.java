package week3;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class Solution1 {
    List<String> strList = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        recursive(0, 0, n, "");
        System.out.println(strList);
        return strList;
    }

    private void recursive(int left,int right, int n, String s) {
        //1.结束条件
        if (left == n && right == n) {
            strList.add(s);
            System.out.println(s);
            return;
        }
        //2.处理过程
        //3.向下调用
        if (left < n)
            recursive(left+1, right, n, s + "(");
        if (right < left)
            recursive(left, right+1, n, s + ")");
        //4.清理状态
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.generateParenthesis(3);
    }

}
