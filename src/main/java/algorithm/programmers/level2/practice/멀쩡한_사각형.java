package algorithm.programmers.level2.practice;

public class 멀쩡한_사각형 {
    public long solution(long w,long h) {
        long big = w > h ? w : h;
        long small = w > h ? h : w;
        
        while (small != 0) {
            long r = big % small;
            big = small;
            small = r;
        }
        
        return (w * h) - (w + h - big);
    }
}
