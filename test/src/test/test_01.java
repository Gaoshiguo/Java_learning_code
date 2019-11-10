/**
 * 
 */
package test;

/**
 * @author 高世国
2019年11月10日
 *
 */
import java.util.*;

public class test_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 从键盘接收数据
		int i = 0;
		double y;
		// next方式接收字符串
		System.out.println("请输入一个整数");
		// 判断是否还有输入
		if (scan.hasNextInt()) {
			i = scan.nextInt();
			if (i < 0) {
				y = 0;
			} else if (i < 10) {
				y = i;
			} else if (i < 20) {
				y = 0.5 * i + 18;
			} else {
				y = 100;
			}
			System.out.println("最终的计算结果为："+y);
		} else {
			System.out.println("您输入的是非法字符");
		}
		scan.close();

	}
}