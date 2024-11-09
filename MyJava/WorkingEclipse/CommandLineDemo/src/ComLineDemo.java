
public class ComLineDemo {
	public static void main(String sr[]) {
		
		double sum = 0;
		for (int i = 0; i < sr.length; i++) {
			
			sum += Double.parseDouble(sr[i])	;	

		}
		System.out.println(sum);
	}
}
