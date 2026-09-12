class Rectangle{
 	double length;
 	double width;

 	public Rectangle(double l,double w){
 		this.length = l;
 		this.width = w;

 	}
 	public double area(){
 		return (length * width);
 	}
 	public double perimeter(){
 		return (2*(length + width));
 	}

 	public static void main(String[] args) {
 		Rectangle r = new Rectangle(10,20);
 		System.out.println("Area = "+ r.area());
 		System.out.println("perimeter = " + r.perimeter());
 	}
 } 