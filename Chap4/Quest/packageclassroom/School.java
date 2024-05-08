package Chap4.Quest.packageclassroom;

public class School {
    public static void main(String[] args) {
        System.out.println(CLassroom.globalKey);
        CLassroom room = new CLassroom(101, "Mrs. Anderson");
        //System.out.println(room.roomNumber); //roomNumber is private that is why i acnot access it. though in same package. I must be in same class to access it
        System.out.println(room.floor);
        System.out.println(room.teacherName);
    }
}
