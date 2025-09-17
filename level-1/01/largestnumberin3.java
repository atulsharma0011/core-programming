import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int n = sc.nextInt();
		
		System.out.println("Enter the second number");
		int m = sc.nextInt();
		
		System.out.println("Enter the Third number");
		int L = sc.nextInt();
		
		if(n>=m && n>=L){
			System.out.println("Is the first number the largest? True");
		}else{
			System.out.println("Is the first number the largest? False");
		}
		
			if(m>=n && m>=L){
			System.out.println("Is the Second number the largest? True");
		}else{
			System.out.println("Is the Second number the largest? False");
		}
		
			if(L>=n && L>=m){
			System.out.println("Is the Third number the largest? True");
		}else{
			System.out.println("Is the Third number the largest? False");
		}
		
	}
}