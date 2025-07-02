import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n);  // 코드1은 정확히 n번 실행됨
        System.out.println(1);  // 최고차항 차수 = 1 (T(n) = n)
    }
}
