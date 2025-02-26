package java_pit;
import java.util.Random;

public class testarray1 {

	public static void main(String[] args) {
		Random a = new Random();
		int[][] array = new int[3][4];
		int sum = 0;
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				array[i][j] = a.nextInt(10);
				System.out.print(array[i][j] + " ");
				sum += array[i][j];
			}
			System.out.println();
		}
		
		System.out.println("합은" + sum);

	}

}
