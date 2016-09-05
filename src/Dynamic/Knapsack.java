//package Dynamic;
//
//public class Knapsack {
//	//static int w1 = 5,w2 = 5,w3 = 5,w4 = 5,w5 = 5,wn = 5,W,Wt,v1=5,v2=5,v3=5,v4=5,v5=5,vn=5;
//
//	public static void main(String[] args) {
//		int val[] = new int[]{60, 100, 120};
//        int wt[] = new int[]{10, 20, 30};
//        int  W = 50;
//        int n = val.length;
//        System.out.println(knapsack(W, wt, val, val.length));
//	}
//
//	static int knapsack(int W,int[]wt, int[]val,int n){
//		for(int i=0;i<n;i++){
//			if(wt[i]<=W){
//				knapsack(W-wt[i], wt, val, n-1);
//			}else{
//				//knapsack(W, wt-wt[i], val, n-1);
//			}
//		}
//		int i = 0;
//		if(wt[i]+wn<=Wt){
//			knapsack(Wt-wn, wt+wn, val+vn);
//		}else
//			knapsack(Wt, wt-wn, val-wn);
//	}
//}
