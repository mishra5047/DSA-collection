    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int remainder = 0;
        int reverse = 0;
        int y = x;
        while (y != 0) {
            remainder = y % 10;
            reverse = reverse * 10 + remainder;
            y /= 10;
        }
       // System.out.println(reverse);
        return reverse==x;
    }
