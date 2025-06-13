import java.util.Arrays;

class Solution {
    public static int solution(String skill, String[] skill_trees) {
        String regex = "[^" + skill + "]";
        return (int) Arrays.stream(skill_trees)
                .filter(tree -> skill.startsWith(tree.replaceAll(regex, ""))).count();
    }
}