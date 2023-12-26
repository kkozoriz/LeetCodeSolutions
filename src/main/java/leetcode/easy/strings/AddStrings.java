package leetcode.easy.strings;

// link: https://leetcode.com/problems/add-strings
// Runtime: 2ms
// Memory: 42.12 Mb
// 26.12.2023
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            var sum = carry;
            if (i >= 0) sum += num1.charAt(i) - '0';
            if (j >= 0) sum += num2.charAt(j) - '0';

            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        if (carry != 0) result.append(carry);

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "456", num2 = "77";

        System.out.printf(addStrings(num1, num2));
    }
}
