
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        String row = sb.toString() + "\n"; // 한 줄 만들기

        sb.setLength(0); // StringBuilder 초기화
        IntStream.range(0, b).forEach(s -> sb.append(row)); // 여러 줄 만들기

        System.out.print(sb.toString()); // 한 번만 출력
    }
}