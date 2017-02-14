
/**
 * 插入排序
 * @author Administrator
 *
 */
public class Insertion {
	
	public static void sort(Object[] a){
		
		//将a[]按升序排列
		int N = a.length;
		
		for(int i = 1;i < N;i++){
			//
			for(int j = i;j > 0 && Example.less(a[j],a[j-1]); j--){
				Example.exch(a, j, j-1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Object[] a = {1,3,5,6,8,2,4,9,10,7};
		//Object[] a = {"d","a","c","b"};
		sort(a);
		Example.show(a);
	}

}
