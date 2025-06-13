import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        List<String[]> logs = new ArrayList<>();

        for (String rec : record) {
            String[] parts = rec.split(" ");
            String command = parts[0];
            String uid = parts[1];

            if (command.equals("Enter")) {
                userMap.put(uid, parts[2]);
                logs.add(new String[]{uid, "들어왔습니다."});
            } else if (command.equals("Leave")) {
                logs.add(new String[]{uid, "나갔습니다."});
            } else if (command.equals("Change")) {
                userMap.put(uid, parts[2]);
            }
        }

        String[] answer = new String[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            String uid = logs.get(i)[0];
            String action = logs.get(i)[1];
            answer[i] = userMap.get(uid) + "님이 " + action;
        }

        return answer;
    }
}
