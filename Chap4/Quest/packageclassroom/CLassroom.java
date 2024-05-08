package Chap4.Quest.packageclassroom;

public class CLassroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    CLassroom(int r, String t) {
    roomNumber = r;
    teacherName = t; 
 }
    // public static void main(String[] args) {   // works here becasue they are in thesame package
    //     System.out.println(CLassroom.globalKey);
    //     CLassroom room = new CLassroom(101, "Mrs. Anderson");
    //     System.out.println(room.roomNumber);
    //     System.out.println(room.floor);
    //     System.out.println(room.teacherName);
    // }
    
}
