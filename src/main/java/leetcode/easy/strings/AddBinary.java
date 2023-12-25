package leetcode.easy.strings;


// link: https://leetcode.com/problems/add-binary
// Runtime: 1ms
// Memory: 41.94 Mb
// 25.12.2023
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b .length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            var sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) result.append(carry);

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "1", str2 = "111";
        System.out.println(addBinary(str1, str2));
    }
}

// 1111
// 0111
//    10110
//    0
