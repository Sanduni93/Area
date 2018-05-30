public class Area{



public void countAreaCircle(){
	int r = 7;

float area = (22*r*r)/7 ;
 
 	
 	System.out.println("Counted area for Circle when radious is "+r+ ":"+area);


 }

public void countSquare(){
int x = 4;
int y = x*x;
System.out.println ("Counted area for Square when length is "+x+ ":"+y);
}

public void countRectangle(){

int x = 5;
int y = 2;
int z = x*y;

System.out.println ("Counted area for Rectangle when length "+x+" and width is "+y+ ":"+z);

}

public void countTriangle(){

int x = 3;
int y = 4;
int z = (x*y)/2 ;

System.out.println("Counted area for Triangle when stand bar "+x+ "and perpendicular is "+y+ ":"+z);

}




	public static void main(String [] args){

Area ar = new Area();
ar.countAreaCircle();
ar.countSquare();
ar.countRectangle();
ar.countTriangle();


	}
}