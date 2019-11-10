/**
 * 
 */
package test;

/**
 * @author 高世国 2019年11月10日
 *
 */
public class add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+' ');	
			}	
			System.out.println('\n');
		}
	}
}
