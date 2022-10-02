import java.util.*;
import java.util.Scanner;

public class A1103309_Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> months = new HashMap<Integer,String>();
        String[] spellings = {"0","Jaunary","Febuary","March","April","May","June","July","August","September","October","November","December"};
        int i = 0,number = 0;
        for(String month : spellings){
            months.put(i,month);
            i++;
        }
        for(;;){
            System.out.printf("請輸入1~12? ");
            number = input.nextInt();
            if(number >=1 && number <= 12){
                break;
            }else{
                System.out.printf("範圍錯誤!\n");
            }
        }
        System.out.printf("第%d月的英文單字為%s",number,months.get(number));
    }
}
