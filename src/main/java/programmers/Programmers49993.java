package programmers;

public class Programmers49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int check = 0;

        char[] sca = skill.toCharArray();
        for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j < sca.length; j++) {
                int temp = skill_trees[i].indexOf(sca[j]);
                if (j == 0) {
                    check = temp;
                    if(j == sca.length-1){
                        answer++;
                    }
                } else {
                    if(temp > check && check != -1){
                        check = temp;
                        if(j == sca.length-1){
                            answer++;
                        }
                    } else if(temp == -1){
                        check = temp;
                        if(j == sca.length-1){
                            answer++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers49993 p = new Programmers49993();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(p.solution(skill, skill_trees));
    }
}
