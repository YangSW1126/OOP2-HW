import java.util.*;
import java.security.SecureRandom;

public class A1103309_Q1 {
    public static void main(String[] args){
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        SecureRandom random = new SecureRandom();
        System.out.printf("電腦從1~100的整數中，亂數取出10個不重複的號碼...\n");
        for(int i = 0;i < 10;){
            int number = 1 + random.nextInt(100);
            if(numbers.contains(number) == false){
                numbers.add(number);
                i++;
                System.out.printf("第%d個號碼:%d\n",i,number);
            }
        }
        System.out.printf("物件內元素個數為:%d\n",numbers.size());
        System.out.println(numbers);
        System.out.printf("第一個元素內容為:%d\n",numbers.first());
        System.out.printf("最後一個元素內容:%d\n",numbers.last());
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            if(num < 30 || num > 70){
                iterator.remove();
                //System.out.println("123");
            }
        }
        System.out.println("內容介於30~70者:" + numbers);
    }
}
