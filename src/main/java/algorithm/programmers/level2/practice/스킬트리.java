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
                Skill s = new Skill();
                s.skill = ch[i];
                s.index = element.indexOf(ch[i]);
                
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
                    return o1.getIndex().compareTo(o2.getIndex());
                }
            });
            
            StringBuilder sb = new StringBuilder();
            for (Skill s : list) {
                sb.append(s.getSkill());
            }
            
            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public class Skill {
        private int index;
        private char skill;
        
        public Integer getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
        public char getSkill() {
            return skill;
        }
        public void setSkill(char skill) {
            this.skill = skill;
        }
    }
}
