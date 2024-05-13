package Chap5.Quest;

public class Aquatic1  implements Aquatic{
    public String getNumberOfGills() { return "4"; } //method overload so works
    public String getNumberOfGills(int input) { return "6"; } // method overide but return types not covariant so does no compile
    public static void main(String[] args) {
        System.out.println(new Aquatic1().getNumberOfGills(-1));
    }
}
