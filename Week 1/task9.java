class UserMainCode {
    public int isPalindrome(int input1) {
        int original = input1;
        int reversed = 0;

        while (input1 != 0) {
            int digit = input1 % 10;
            reversed = reversed * 10 + digit;
            input1 /= 10;
        }

        return (original == reversed) ? 1 : 0;
    }
}