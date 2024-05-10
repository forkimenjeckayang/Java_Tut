package Chap4.Quest;

public class Order {
    static String result = ""; // initialized first
    { result += "c"; } // initialized first on new instance
    static { result += "u"; } // initialized second
    { result += "r"; } // initialized second on new instance

    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
      value3 = "4";
      value2 = "5";
    }
    static {
    value2 = "6";
    //value1 = "7"; // cannot compile because final variable has already been assigned
    }
}
