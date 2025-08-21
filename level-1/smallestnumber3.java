import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first");
		int n = sc.nextInt();
				System.out.println("Enter first");
		int m = sc.nextInt();
				System.out.println("Enter first");
		int L = sc.nextInt();
		
		if(n<m&&m<L){
			System.out.println("Is the "+ n + " number the smallest? Yes");
		}else{
			System.out.println("Is the "+ n +" number the smallest? No");
		}
	}
}