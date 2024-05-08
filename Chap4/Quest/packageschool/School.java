package Chap4.Quest.packageschool;

import Chap4.Quest.packageclassroom.*;

public class School {
    public static void main(String[] args) {
        // System.out.println(CLassroom.globalKey); // in a diffrent package and  and globalKey hs default access modifier making it visiible only in same package
        // CLassroom room = new CLassroom(101, "Mrs. Anderson"); // constructor is with defaault access and so cann ot be accessible from a different package
        // System.out.println(room.roomNumber); // roomNumber is private and cannot be accessed from a different package or same package only within the class.
        // System.out.println(room.floor); // accesible because it is public
        // System.out.println(room.teacherName); // teacherName is protcted so can only be accessed from same package or subclass
    }
}
