package squared;

public class Squared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = {1.24,4.54,4,77,9.89};
		System.out.println("Der Durchschnitt ist: " + avg(array) );
	}

	static double avg( double[] array ) {
		if( array == null || array.length == 0 )
			throw new IllegalArgumentException( "Array null oder leer");
		
		double sum = 0;
		
		for( double n : array )
			sum+= n;
		
		System.out.println("A new change has made!");
		
		return sum;
	}
}
