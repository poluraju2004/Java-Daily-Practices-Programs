public class staticvariable {

    //static variables
    static int a = 10,b = 20;
    
    public static void main(String[] args){

        // object Creation
        staticvariable stv = new staticvariable();

        // accesing static variable without classname
        System.out.println("A + B = " + (a+b));

        //accessing static variable with  Classname

        System.out.println("A - b = "+(staticvariable.a - staticvariable.b));


        // access static avriable with object name

        System.out.println("A * B = " + (stv.a+stv.b));
    }
}
