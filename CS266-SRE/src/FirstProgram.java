
public class FirstProgram {

	public void print(String s1) {
		System.out.println(s1);
	}
	
	public int add(int i, int j) {
		return (i+j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProgram testobj = new FirstProgram();
		testobj.print("Hello Rushikesh, Welcome to Reverse Engineering World");
		int i = testobj.add(4, 10);
		System.out.println("Addition of the numbers are ::" + i);
	}

}
