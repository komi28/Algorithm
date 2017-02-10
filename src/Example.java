
/**
 * 排序公共方法
 * @author Administrator
 *
 */
public class Example {
	
	/**
	 * 对元素进行比较
	 * @param v
	 * @param w
	 * @return
	 * v<w返回true
	 */
	public static boolean less(Object v,Object w){
		return ((Comparable) v).compareTo(w)<0;
	}

	/**
	 * 元素互换
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void exch(Object[] a,int i,int j){
		Object t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Object[] a){
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	/**
	 * 判断是否有序
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Object[] a){
		for(int i = 1;i<a.length;i++){
			if(less(a[i], a[i-1]))return false;
		}
		return true;
	}
	
}
