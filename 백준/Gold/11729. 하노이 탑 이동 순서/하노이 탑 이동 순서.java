import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 3, 2); 
        System.out.println((int)Math.pow(2, n) - 1); 
        System.out.println(sb); 
    }

    public static void hanoi(int n, int from, int to, int mid) {

        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, from, mid, to);

        sb.append(from).append(" ").append(to).append("\n");

        hanoi(n - 1, mid, to, from);
    }
}
