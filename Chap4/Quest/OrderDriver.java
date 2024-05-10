package Chap4.Quest;

public class OrderDriver {
    // static String result = ""; // initialized first
    // { result += "c"; } // initialized first on new instance
    // static { result += "u"; } // initialized second
    // { result += "r"; } // initialized second on new instance

    //after finishing with statics it goes to the main method so result now is "u"
    public static void main(String[] args) { 
        System.out.print(Order.result + " "); // u since it has initialized only statics yet
        System.out.print(Order.result + " "); // u still snce we are still with the statics
        new Order(); // initialized the instance varibale // so result now is "ucr"
        new Order(); // does same again with instance variables // so we have ucrcr
        System.out.print(Order.result + " "); // outputs: ucrcr
    }
}
