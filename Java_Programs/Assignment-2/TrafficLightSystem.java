import 
class TrafficLightCmdLineArg{
	public static void main(String args[]){
		char light  = (args[0]).charAt(0);
		switch(light){
		case 'R':
			System.out.println("Stop");
			break;
		case 'Y':
			System.out.println("Wait");
			break;
		case 'G':
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Signal Light")

		} 

	}
}