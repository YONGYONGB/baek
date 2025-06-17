import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;

        for (char d : dirs.toCharArray()) {
            int nx = x;
            int ny = y;

            switch (d) {
                case 'U': ny++; break;
                case 'D': ny--; break;
                case 'L': nx--; break;
                case 'R': nx++; break;
            }

            // 경계 넘어가면 무시
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            // 경로를 양방향 동일하게 표현
            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;

            visited.add(path1);
            visited.add(path2); // 방향 반대도 넣어두면 나중에 중복 방지 쉬움

            x = nx;
            y = ny;
        }

        return visited.size() / 2; // 양방향 저장했으니 2로 나눠줌
    }
}
