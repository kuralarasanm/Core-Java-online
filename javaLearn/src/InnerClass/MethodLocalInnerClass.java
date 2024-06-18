package InnerClass;

class Outers {

	private class Inner{
		public void show() {
			System.out.println("in private inner show method ");
		}
	}
	public void getAccess() {
		class Inner {
			public void show() {
				System.out.println("in method local inner class ");
			}
		}
		Inner in = new Inner();
		in.show();
	}
}

public class MethodLocalInnerClass{
	public static void main(String[] args) {
		Outers out = new Outers();
		out.getAccess();
	}
}
