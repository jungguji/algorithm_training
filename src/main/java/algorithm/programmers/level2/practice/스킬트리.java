package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        char[] ch = skill.toCharArray();
        
        List<ArrayList<Skill>> l = new ArrayList<ArrayList<Skill>>();
        for (String element : skill_trees) {
            ArrayList<Skill> list = new ArrayList<Skill>();
            
            for (int i = 0; i < ch.length; i++) {
                Skill s = new Skill(element.indexOf(ch[i]), ch[i]);

                if (s.index != -1) {
                    list.add(s);
                }
            }
            
            l.add(list);
        }
        
        int answer = 0;
        for (ArrayList<Skill> list : l) {
            Collections.sort(list, new Comparator<Skill>() {
                @Override
                public int compare(Skill o1, Skill o2) {
                    return o1.index.compareTo(o2.index);
                }
            });
            
            StringBuilder sb = new StringBuilder();
            for (Skill s : list) {
                sb.append(s.skill);
            }
            
            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public class Skill {
        public Integer index;
        public char skill;

        public Skill(Integer index, char skill) {
            this.index = index;
            this.skill = skill;
        }
    }
}
