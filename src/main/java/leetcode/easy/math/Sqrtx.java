package leetcode.easy.math;

// link: https://leetcode.com/problems/sqrtx
// Runtime: 1ms
// Memory: 41.18 Mb
// 26.12.2023
public class Sqrtx {
    public static int mySqrt(int x) {
        long result = x;
        while (result * result > x) {
            result = x / result + (result - x / result) / 2;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int x = 1024;
        System.out.println(mySqrt(x));
    }
}
