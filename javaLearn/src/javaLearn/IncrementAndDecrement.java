package javaLearn;
//prefix and postfix form of increment & decrement operators
public class IncrementAndDecrement {
	public static void main(String[] args) {
		// ++n(pre-increment),++n(post increment)
		int n=5;
		System.out.println(n++);//5
		System.out.println(n);//6
		System.out.println(++n);//7
		System.out.println(--n);//6
		System.out.println(n--);//6
		System.out.println(n);
	}
}
