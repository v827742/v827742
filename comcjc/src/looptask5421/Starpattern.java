package looptask5421;

public class Starpattern {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		
		char a='E';
		for(int i=1;i<=5;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print(a+" ");
			}
			System.out.println();
			a--;
		}
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		  int b=5;
		for(int i=1;i<=5;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print(b+" ");
			}
			System.out.println();
	         b=b-1;
		}
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		
		for(int i=1;i<=5;i++){
			char ch='E';
			for(int k=1;k<=i;k++){
				System.out.print(" ");
				
			}
			for(int j=5;j>=i;j--){
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
			
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
	         
		for(char i=65;i<=69;i++){
	           
			for(char k=65;k<=i;k++){
				System.out.print(" ");
				
			}
			for(char j=69;j>=i;j--){
				for(char l=i;l<=j;l++){
				
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		
		
	}

	}}
