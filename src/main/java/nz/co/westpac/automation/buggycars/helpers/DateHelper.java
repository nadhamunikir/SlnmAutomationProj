package nz.co.westpac.automation.buggycars.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHelper {
    public String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime ldt = LocalDateTime.now();
        String localDateTime = dtf.format(ldt);
        localDateTime= localDateTime.replaceAll("\\s","");
        return localDateTime;

    }
}
