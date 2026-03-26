package Collection_컴페어러블_학생성적정렬;

import java.util.Scanner;
import java.util.TreeSet;

/*
    학생 객체 기준으로 성적(평균)을 정렬하되, 성적이 같으면 이름순으로 정렬
    성적 - 국어, 영어, 수학. 입력받아 총점 및 평균 계산
    Field - name, kor, eng, mat, tot, avg
    Print - name, avg
*/
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> st = new TreeSet<>();
        System.out.print("1. 이름 국어 영어 수학 순서로 입력하세요 : ");
        st.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("2. 이름 국어 영어 수학 순서로 입력하세요 : ");
        st.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("3. 이름 국어 영어 수학 순서로 입력하세요 : ");
        st.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("4. 이름 국어 영어 수학 순서로 입력하세요 : ");
        st.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("5. 이름 국어 영어 수학 순서로 입력하세요 : ");
        st.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));

        int i = 0;
        for (Student student : st) {
            System.out.printf("%d. 이름 : %s | 평균 : %.2f\n", ++i, student.name, student.avg);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor, eng, mat, tot;
    double avg;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = kor + eng + mat;
        this.avg = tot / 3.0;
    }

    @Override
    public int compareTo(Student o) {
//        if (this.avg != o.avg) return (int)Math.round(o.avg - this.avg);
        if (this.avg != o.avg) return Double.compare(o.avg, this.avg);
        return this.name.compareTo(o.name);
    }
}