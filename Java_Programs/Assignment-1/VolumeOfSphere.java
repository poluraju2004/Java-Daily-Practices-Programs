class VolumeOfSphere{
	public static void main(String args[]){

        float r=Integer.parseInt(args[0]);
        double v =(4/3)*Math.PI*r*r*r;

        System.out.println("Volume of Sphere = " + v);
       

    }
}