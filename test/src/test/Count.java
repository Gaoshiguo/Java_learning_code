import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {

    public static void main(String[] args){
        System.out.println("请输入一串字符");
        Scanner scan= new Scanner(System.in);
        if(scan.hasNext()){
            String i =scan.next();
            int capital_numbercount=0,lower_numbercount=0,number=0;
            for(int j=0;j<=i.length()-1;j++){
                char s=i.charAt(j);
                if('a'<=s&&'z'>=s){
                    lower_numbercount=lower_numbercount+1;
                }
                else if('A'<=s&&'Z'>=s){
                    capital_numbercount=capital_numbercount+1;

                }
                else if('0'<=s&&'9'>=s){
                    number=number+1;
                }

            }
            System.out.printf("您所输入的字符串是：%s\n",i);
            System.out.printf("其中大写字母的个数为：%d个\n",capital_numbercount);
            System.out.printf("其中小写字母的个数为：%d个\n",lower_numbercount);
            System.out.printf("其中整数的个数为：%d个\n",number);

        }
        else{
            System.out.println("请重新输入");
        }

    }



}
