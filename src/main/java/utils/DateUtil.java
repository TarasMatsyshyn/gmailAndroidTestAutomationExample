package utils;

import java.time.LocalDateTime;

public class DateUtil {
    public static String getSystemCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        return now.toString();
    }

}
