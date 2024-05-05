package Chap3;

public class Quest2 {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
        }
        public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Quest2().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2); //outputs roar roar!!!
}
}