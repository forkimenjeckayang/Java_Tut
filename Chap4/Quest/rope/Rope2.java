package Chap4.Quest.rope;

import java.util.ArrayList;
import static java.util.Collections.*; // this imports all static members of the collections class
//static import java.util.Collections.*; // cannot begin with static when doing an import
// import static java.util.Collections.sort(ArrayList<String>); import just the method names withoutt paraters

public class Rope2 {
    public static int length = 0;

    public void method(ArrayList<String> list) {
        sort(list);
    }
}
