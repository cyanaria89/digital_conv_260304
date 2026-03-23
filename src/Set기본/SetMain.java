package Set기본;

import java.util.HashSet;
import java.util.Set;
/*
    Set (집합) : 중복을 허용하지 않음 (hashCode() 와 equals() 의 반환값으로 중복여부를 확인함
    HashSet() : 순서를 유지하지 않음
*/
public class SetMain {
    public static void main(String[] args) {
        /*
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C#");
        set.add("JavaScript");
        set.add("Java");
        System.out.println(set);
        */
        Set<MemberSet> set = new HashSet<>();
        set.add(new MemberSet(1010, "수나"));
        set.add(new MemberSet(1011, "아리아"));
        set.add(new MemberSet(1012, "남궁우"));
        set.add(new MemberSet(1010, "S"));      // 중복 제거 안됨
    }
}
