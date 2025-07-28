import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1]; // 전역 변수 초기화
        result = new int[m];

        dfs(0); // 깊이 0부터 시작

        System.out.print(sb.toString()); // 결과 출력
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                dfs(depth + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}
