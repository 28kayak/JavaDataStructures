//ArrayDef.java
public class ArrayDef 
{
	public static void main(String[] args) 
	{
		float x[];//declares x[] to be an array object which does not allocate any storeage for the array
		x = new float[100];//allocate here. defines x[] to have 100 float components.
		
		args = new String[10];//dexlare args[] to be an array of 10Strings objects. Note the two different(equivalent)ways to declares an array.
		//The brackets may be a suffix on the type identifier or on the array identifier. 
		//args is difined at paramters of main
		
		boolean[] isPrime = new boolean[1000];//define isPrime[] to be an array of 1000 boolean variables. 
		
		int fib[] = {0,1,1,2,3,5,8,13};//define an array of 8ints, initializing them to the 8values listed. 
		
		short[][][] b = new short[4][10][5];//defines b[] to be a three-dimensional array of 4 components, 
		//two-dimensional array of 10 components and one-dimensional array of 5 components
		double a[][] = {{1.1,2.2},{3.3,4.4},null,{5.5,6.6},null};
		a[4] = new double[66];//allocate a 66-elements array of double to a[4]
		a[4][65] = 3.14;//assigns 3.14 to its last elements
		//ragged array witch is 2D array with rows of different length. 
		
		Object[] object = {x,args,isPrime,fib,b,a};
		//defines the array object to consist of six components,each of which is itself an array

		
	}
}