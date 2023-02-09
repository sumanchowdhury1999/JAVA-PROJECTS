package Question1;


	public class Area extends Shape{

	    public void RectangleArea(double lenght, double width) {
	        System.out.printf("Rectangle area = "+lenght*width);
	        System.out.println("");
	    }

	    public void SquareArea(double side) {
	        System.out.printf("Square area = " +side*side);
	        System.out.println("");
	    }

	    public void CircleArea(double radius) {
	        System.out.printf("Circle area = "+ Math.PI*radius*radius);
	        System.out.println("");
	    }
	
}
