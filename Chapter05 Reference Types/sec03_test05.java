package sec03.test02;

public class test05 {

	public static void main(String[] args) {

		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		

	
		int count = 0; // count++ 를 씀. 초반 0값 초기화.
		for (int i=0; i<array.length;i++) {
			for (int j=0; j< array[i].length;j++) {
				sum += array[i][j];
				count++; // count++ 를 써서 총 갯수 저절로 올라감. 
			}
		}
		
		avg = (double) sum/count;
		
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		
	}

}
