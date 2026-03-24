package 컴페어러블실습_학생성적정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMainA {
    public static void main(String[] args) {
        List<StudentA> list = new ArrayList<>();
        list.add(new StudentA("JHJ",77, 59, 84));
        list.add(new StudentA("JJJ",87, 72, 76));
        list.add(new StudentA("HJJ",91, 54, 82));
        list.add(new StudentA("KTY",98, 75, 71));
        list.add(new StudentA("HJH",98, 71, 75));

        // 객체 내부에 정렬 조건을 넣어 두었기 때문에 해당 조건으로 정렬시킴
        // 따로 정렬 조건을 넣지 않았을 경우 list 내부가 객체 타입이기 때문에 단순이 오름차순으로 정렬할 수 없어 정렬되지 않음
        Collections.sort(list);
        for (StudentA sa : list) {
            System.out.printf("이름 : %s | 총점 : %d\n", sa.name, sa.getTotal());
        }
    }
}

class StudentA implements Comparable<StudentA> {
    String name;
    int kor, eng, mat;

    public StudentA(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotal() { return kor + eng + mat; }

    @Override
    public int compareTo(StudentA o) {
        // 1. 총점 내림차순
        if (this.getTotal() != o.getTotal()) {
            return o.getTotal() - this.getTotal();  // + > 정렬 조건, - > 유지, 0 > 같음
        }
        // 2. 이름 오름차순
        return this.name.compareTo(o.name); // ASCII 기준으로 오름차순 정렬
    }
}