class UserMainCode {
    public int sumOfLastTwoDigits(int input1, int input2) {
        int last1 = Math.abs(input1) % 10;
        int last2 = Math.abs(input2) % 10;
        return last1 + last2;
    }
}