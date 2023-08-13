package Bai2;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2_JS {

  // Viết chương trình để in nội dung window hiện tại
  public static void print(ArrayList<String>noidung){
    for(int i = 0; i< noidung.size(); i++){
      System.out.println(noidung.get(i));
    }
  }
  public static void main(String[] args) {
    ArrayList<String> noidung = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    System.out.println("So dong noi dung");
    int line = sc.nextInt();
    for(int i = 0; i <= line; i++){
      String nhap = sc.nextLine();
      noidung.add(nhap);
    }
  print(noidung);
  }

}
