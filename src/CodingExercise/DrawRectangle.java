package CodingExercise;

public class DrawRectangle {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		int height=4;
		int width=8;
		
		drawRectagle(height,width);
	}

	private static void drawRectagle(int height, int width) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<height;i++) {
			
			for(int j=0;j<width;j++) {
				if((i==0 || i==height-1))
				System.out.print("+");
				else
				{
					if(j==width-1 || j==0)
					System.out.print("+");
					else
						System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
