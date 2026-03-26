package 자바API_날짜와시간;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
/*
    Date : JDK 1.0 에서 부터 포함. 현시점에서는 대체할 것이 있기때문에 사용 X. UTC 개념 기반
           로케일 처리, 윤년 처리 등에 취약해서 최근엔 쓰이지 않음
    SimpleDateFormat > HH - 24hour, hh - 12hour, MM - month, mm - minute
    Calender : JDK 1.1 에 추가.
    java.time : JDK 1.8 이후 도입, 가장 권장되는 방식
*/
public class DateMain {
    public static void main(String[] args) {
        // Date
        Date date = new Date();
        System.out.println(date);

        // SimpleDateFormat 이용하여 원하는 형식으로 변경해서 출력
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yy년 MM월 dd일");
        SimpleDateFormat sdf4 = new SimpleDateFormat("hh시 mm분 ss초");
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        System.out.println(sdf4.format(date));

        // Calender
        Calendar cal = Calendar.getInstance();  // 추상클래스
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.printf("%d년 %d월 %d일 %d : %d : %d\n", year, month, day, hour, minute, second);

        // java.time
        LocalDate lDate = LocalDate.now();          // 오늘 날짜
        LocalTime lTime = LocalTime.now();          // 현재 시간
        LocalDateTime ldt = LocalDateTime.now();    // 현재 시점 날짜와 시간
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println(lDate);
        System.out.println(lTime);
        System.out.println(ldt);
        System.out.println(zdt);

        // 날짜 포맷으로 출력하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(ldt.format(formatter));

        // 다양한 포맷 패턴
        String[] patterns = {
                "yyyy-MM-dd HH:mm:ss",
                "yyyy/MM/dd",
                "yyyy년 MM월 dd일",
                "HH:mm:ss",
                "hh:mm a",
                "yyyy-MM-dd E요일",
                "yyyyMMddHHmmss",
                "yyyy-MM-dd G"
        };
        for (String pattern : patterns) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
            String rst = ldt.format(dtf);
            System.out.println(rst);
        }

        // 시간대 처리
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);
    }
}
