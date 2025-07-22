import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                result += set.size();  // 현재 세션의 유니크 닉네임 수 더함
                set.clear();           // 세션 초기화
            } else {
                set.add(input);        // 중복되지 않게 저장됨
            }
        }

        result += set.size(); // 마지막 세션 누락 방지
        System.out.println(result);
    }
}
