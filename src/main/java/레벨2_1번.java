import java.util.HashMap;
import java.util.Map;

public class 레벨2_1번 {
    // picture는 2차원 배열
    // 원소는 2^31 -1 이하 값 = long으로 해봐
    // 값이 0 인건 색칠 안한거 ? 의미가 있나?
    // 상하좌우가 이어져 있어야됌
    // 좌우 체크는 ok
    // 상하 체크는 어떻게?
    // 내 왼쪽이 없는지 오른쪽이 없는지
    // 위 아래가 있는지 없는지 어떻게 체크?
    // picture랑 같은 사이즈 어레이 만듬
    // 만들어서 거긴 영역 사이즈를 저장하는 class를
    // 저장해
    // 반복 돌면서 색갈 있으면 색 있는 index에
    // new Class해서 하나 만들고 사이즈를 증가시켜
    // 0번쨰 j끝
    // 1,0 부턴 위에도 체크해 i-1이랑 i랑 숫자가 같은지
    // 같으면 그 인덱스에 있는 class가져와서 사이즈 증가시켜
    // 그리고 똑같이 j -1이랑 같은지 확인해
    
    public int[] solution(int m, int n, int[][] picture) {
        int iLength = picture.length;
        int jLength = picture[0].length;
        
        Area[][] areas = new Area[iLength][jLength];
        
        Map<Integer, Area> map = new HashMap<Integer, Area>();
        
        int numberOfArea = 0;
        
        if (picture[0][0] != 0) {
            Area area = new Area(1);
            areas[0][0] = area;
            ++numberOfArea;
            
            map.put(area.hashCode(), area);
        }
        
        for (int i = 0 ; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                boolean isExistArea = false;
                
                if (picture[i][j] == 0) {
                    continue;
                }
                
                if (i != 0) {
                    if (picture[i][j] == picture[i-1][j]) {
                        Area area = areas[i-1][j];
                        area.amout++;
                        
                        areas[i][j] = area;
                        isExistArea = true;
                    }
                }
                
                if (j != 0) {
                    if (picture[i][j] == picture[i][j-1]) {
                        Area area = areas[i][j-1];
                        area.amout++;
                        
                        areas[i][j] = area;
                        isExistArea = true;
                    }
                }
                
                if (!isExistArea) {
                    Area area = new Area(1);
                    areas[i][j] = area;
                    map.put(area.hashCode(), area);
                    
                    ++numberOfArea;
                }
            }
        }
        
        int maxSizeOfOneArea = 0;
        for (Map.Entry<Integer, Area> entry : map.entrySet()) {
            if (maxSizeOfOneArea < entry.getValue().amout) {
                maxSizeOfOneArea = entry.getValue().amout;
            }
        }
        

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
    
    class Area {
        public int amout = 0;
        
        public Area(int amount) {
            this.amout = amount;
        }
    }
}
