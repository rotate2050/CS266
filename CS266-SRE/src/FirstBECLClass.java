import java.io.IOException;
import java.util.Arrays;

import org.apache.bcel.*;
import org.apache.bcel.generic.*;
import org.apache.bcel.classfile.*;



public class FirstBECLClass {

	public static void main(String[] args) throws ClassFormatException,
			IOException {

		/* An existing class can be parsed with ClassParser */
		JavaClass myClass;
		ClassGen myClassGen;
		try {
			myClass = Repository.lookupClass("FirstProgram");
			myClassGen = new ClassGen(myClass);
			System.out.println("*******Methods*********");
			System.out.println(Arrays.toString(myClassGen.getMethods()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
