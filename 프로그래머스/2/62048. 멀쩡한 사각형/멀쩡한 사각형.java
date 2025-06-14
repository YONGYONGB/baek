class Solution {
    public long solution(int w, int h) {
        int gcd = getGCD(w, h);  // 최대공약수
        long blocked = (long)w + (long)h - gcd; // 잘린 사각형 개수
        return (long)w * (long)h - blocked;
    }

    // 최대공약수(GCD) - 유클리드 알고리즘
    private int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
