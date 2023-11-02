package Assessment_2;

public class Constructor_6 {
		double width,height,depth;
		
		 Constructor_6(){
		 }
		 Constructor_6( double wid , double heig, double dep){
			 width = wid ;
			 height = heig ;
			 depth = dep;
		 }
		 void volume() {
			 System.out.println( " volume: " + width*height*depth);
		 }
			public static void main(String[] args) {
				Constructor_6 c1 = new Constructor_6();
				Constructor_6 c2 = new Constructor_6(36,24,48);
				
				c1.volume();
				c2.volume();
			}
	}