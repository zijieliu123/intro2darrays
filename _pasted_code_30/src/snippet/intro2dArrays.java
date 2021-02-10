package snippet;

public class intro2dArrays {
	
	//A gives an array of null length. B gives an array with 2 rows and one column. C gives an array
	//of one row and two columns. D gives an array of null rows and two columns. E gives an array of null 
	//rows and one column. F gives an array of two rows and one column. G gives an array of 
	//one row and one column. H gives a character array of three rows and one column. I gives an 
	//array of one column. 
	
	
	
	
	public void zeroarray(int n) {
		
		String[][] arr = new String[n][n];
		
	}
	
	public void columnnum(String[][] arr2) {
		
		
		System.out.println(arr2[0].length);
		
	}
	
	public void threestuff(int a , int b, int c, int d, int e, int f) {
		int[][] arr3 = {{a}, {b, c}, {d, e, f}};
	}
	
	
}

