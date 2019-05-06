package day07;
//作业讲解
public class Homework {
	public static void main(String[] args) {
		/*
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("最小值为:"+min);
		
		int[] as = new int[arr.length+1];
		System.arraycopy(arr,0,as,1,arr.length);
		as[0] = min;
		for(int i=0;i<as.length;i++) {
			System.out.println(as[i]);
		}
		*/
		
		int[] arr = generateArray(8,50);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static int[] generateArray(int len,int max){
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*max);
		}
		return arr;
	}
	
}
















