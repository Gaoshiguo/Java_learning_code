import java.util.*;
public class RecursionBottle {
    public static void main(String[] args){
        System.out.println("使用空瓶子换汽水，换取规则是三个空拼字可以换取一瓶汽水！");
        System.out.println("请输入您手中的空瓶子数");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            int i=scan.nextInt();
            int drink=Recursion(i,0);
            if(drink<=0){
                System.out.println("您的瓶子太少，换不到汽水喝");
            }
            else{
                System.out.printf("您的空瓶子可以换取%d瓶汽水喝",drink);

            }

        }
        else{
            System.out.println("您的输入不合法，请重新输入");
        }


    }

    public static int Recursion(int Bottle,int drinks){
       int bottle=Bottle%3;
       drinks = drinks+(Bottle/3);
       if(Bottle<3){
           return drinks;
        }
       else{
           return Recursion((Bottle/3)+bottle,drinks);
       }

    }
}
