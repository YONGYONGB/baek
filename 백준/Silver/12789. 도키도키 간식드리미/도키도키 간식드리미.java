import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        int count = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == count) {
                count++;
                while (!stack.isEmpty() && stack.peek() == count) {
                    stack.pop();
                    count++;
                }
            } else {
                stack.push(num); // Deque는 stack처럼 push/pop 사용 가능
            }
        }

        // 성공 조건: 스택이 비어있고 count == n+1
        if (stack.isEmpty() && count == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
