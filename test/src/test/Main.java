import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = 0;
        int jc=1;
        int result=0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("您输入的数字是：" + number);
            for(int i=1;i<=number;i++){
                for(int j=1;j<=i;j++){
                    jc *=j;
                }

                result=result+jc;
                jc=1;

            }
    System.out.printf("小于整数%d的所有正整数阶乘之和是：%d",number,result);
        }
        else{
                System.out.println("您输入的字符不合法");
            }
            scanner.close();
        }
    }


