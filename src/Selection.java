
/**
 * 选择排序
 * @author Administrator
 *
 */
public class Selection {
	
	public static void sort(Object[] a){
		//将a[]按升序排列
		int N = a.length;
		for(int i = 0;i < N;i++){
			int min = i;
			for(int j = i+1;j<N;j++){
				//判断a[j]是否小于a[min],保证a[min]是a[i+1..N]的最小元素
				if(Example.less(a[j], a[min])){
					min = j;
				}
			}
			//将a[i]和a[i+1..N]中最小的元素交换
			Example.exch(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		//Object[] a = {1,3,5,6,8,2,4,9,10,7};
		Object[] a = {"d","a","c","b"};
		sort(a);
		Example.show(a);
	}

}
