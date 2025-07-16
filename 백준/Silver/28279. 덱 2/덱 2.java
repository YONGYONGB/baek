import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int k = 0;

            if (m == 1 || m == 2) {
                k = Integer.parseInt(st.nextToken());
            }

            switch (m) {
                case 1:
                    dq.offerFirst(k);
                    break;
                case 2:
                    dq.offerLast(k);
                    break;
                case 3:
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
                    break;
                case 4:
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
                    break;
                case 5:
                    sb.append(dq.size()).append('\n');
                    break;
                case 6:
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7:
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
                    break;
                case 8:
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
