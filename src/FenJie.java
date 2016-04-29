
/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * @author Administrator
 *
 */
public class FenJie {
	
	public static void getNumber(int number){
		int a = 2;
		System.out.print(number + "=");
		while(number > a){
			if(number % a == 0){
				System.out.print(a + "*");
				number = number / a;
			}else{
				a++;
			}
		}
		
		System.out.print(a);
	}
	
	public static void main(String[] args) {
		getNumber(90);
    }
}
