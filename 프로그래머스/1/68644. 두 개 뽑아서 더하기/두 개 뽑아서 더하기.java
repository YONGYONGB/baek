import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]); // 중복 제거하면서 저장
            }
        }

        // Stream을 이용하여 정렬 후 배열로 변환
        return set.stream()
                  .sorted() // 정렬
                  .mapToInt(Integer::intValue) // int 배열로 변환
                  .toArray();
    }
}