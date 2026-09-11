class AreaOfRectangle{
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int three = Integer.parseInt(args[2]);
		double area = length * width;

		System.out.println("area = "+area);
	}
}