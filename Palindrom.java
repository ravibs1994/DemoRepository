import java.util.Scanner;
class Palindrom{
	public static void main(String []args){
	  int r=0,n=0,result=0,o=0;
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  n=sc.nextInt();
		o=n;
		while(n!=0){
			r=n%10;
			result=result*10+r;
			n=n/10;
			}
			if(result==o){
			System.out.println("Pallindrom no "+result);
			}else{
				System.out.println(" Not Pallindrom no "+result);
			}
		}
	}
			
							