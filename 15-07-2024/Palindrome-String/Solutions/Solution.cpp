class Solution {
public:
    bool isPalindrome(string s) {
        string sb;
        for (int i = 0; i < s.length(); ++i) {
            if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z') || (s[i] >= '0' && s[i] <= '9')) {
                if (s[i] >= 'A' && s[i] <= 'Z') {
                    sb += (char)(s[i] + 32);
                } else {
                    sb += s[i];
                }
            }
        }

        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb[i] == sb[j]) {
                ++i;
                --j;
            } else {
                return false;
            }
        }
        return true;
    }
};