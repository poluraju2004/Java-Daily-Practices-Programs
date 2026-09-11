class CoumpoundInterest{
	public static void main(String[] args)
	{
        float p =Integer.parseInt(args[0]);
        float r=Integer.parseInt(args[1]);
        float n=Integer.parseInt(args[2]);
        float t=Integer.parseInt(args[3]);
        double A=p*Math.pow((1+(r/n)),(n*t));

        System.out.println("Compund interest ="+A);
	}
}