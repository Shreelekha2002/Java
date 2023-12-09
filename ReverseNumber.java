public class ReverseNumber{
	static int rem;
	 public static void main(String args[]){
		int n=128;
		int temp=n;
		int rev=0;
			System.out.println("original number is:"+n);
		while(n>0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.println("reversed number is "+rev);
		if(temp==rev){
			System.out.println("the given number is palindrome number");
			
		}
		if(temp!=rev){
			System.out.println("the given number is not a palindrome number");
		}
	 }
}