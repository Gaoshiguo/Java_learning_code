import java.util.*;
public class RecursionThreePara {
    public static void main(String[] args){
        System.out.println("规则如下：有若干元块钱，汽水一块钱一瓶，2个空瓶可以换一瓶汽水，3个瓶盖也也可以换一瓶汽水，问共可以喝到多少瓶汽水？");
      Scanner scan=new Scanner(System.in);
      System.out.println("请输入您手中的钱数");
      if(scan.hasNextInt()){
          int i =scan.nextInt();
          int result =Recursion(i,0,0);
          System.out.printf("您一共可以喝到  %d   瓶汽水",result);
      }
      else{
          System.out.println("您的输入不合法");
      }

        Recursion(20,0,0);

    }

    public static int Recursion(int Total,int Bottle,int Caps){
        Bottle=Bottle%2;
        Caps=Caps%3;
        Bottle=Total+Bottle;
        Caps=Total+Caps;
        if(Bottle<2&&Caps<3){
            return Total;
        }
        else{
            return Recursion((Bottle/2+Caps/3),Bottle,Caps)+Total;
        }
    }
}
