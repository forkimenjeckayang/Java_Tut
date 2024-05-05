package Chap4;

public class WithStaticVarAndMethods {
    public static String name = "Forkim";
    public static void user(){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args){
        //calling the user method without a refrence becasue it is static
        WithStaticVarAndMethods.user();
        System.out.println(WithStaticVarAndMethods.name);

        // though static we can still use the instance of a class to access the static members
        WithStaticVarAndMethods s = new WithStaticVarAndMethods();
        s.user();
        String named =  s.name=null;
        System.out.println(named);
    }
}
