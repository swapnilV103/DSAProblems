package SaishQuestions;

public class numberAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3,b=8;
		
		for(int i=1;i<=8;i++) {
			for(int j=0; j<=8;j++) {
				for(int k=0;k<=8;k++) {
					int sum = i+j+k;
					
					if(sum==b) {
						System.out.print(i+"+"+k+"+");
						System.out.print(j+"=8 ");
					}
				}
				
			}
		}
		

	}

}
