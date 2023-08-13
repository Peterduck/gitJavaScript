package Bai3;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.text.DateFormatter;

public class Bai3_JS {

  /*
  Viết chương trình JavaScript/Java để lấy ngày hiện tại.
Expected Output :
mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy
*/
  public static void main(String[] args) {
    LocalDateTime date = LocalDateTime.now();
    System.out.println("yyyy/mm/dd");
    System.out.println("Before: " + date);
    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("mm-dd-yyyy HH:mm:ss");
    String format = date.format(formatObj);
    System.out.println("mm-dd-yyyy: "+format);
    DateTimeFormatter formatObj1 = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss");
    String format1 = date.format(formatObj1);
    System.out.println("mm/dd/yyyy: "+format1);
    DateTimeFormatter formatObj2 = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
    String format2 = date.format(formatObj2);
    System.out.println("dd-mm-yyyy: "+format2);
    DateTimeFormatter formatObj3 = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
    String format3 = date.format(formatObj3);
    System.out.println("dd/mm/yyyy: "+format3);
  }
}
