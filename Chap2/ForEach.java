package Chap2;

public class ForEach {
    public static void main(String[] args) {

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        //the return type of names is same as the name variable
        for(String name : names) {
        System.out.println(name + "");
        }

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        //same here, the return type of values is same as the value variable in ArrayList
        for(String value : values) {
            System.out.print(value + ", ");
        }
        for(int i=0; i<values.size(); i++) {
            String name = values.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
}
