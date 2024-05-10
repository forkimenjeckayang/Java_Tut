package Chap4.Quest;

public class Create {
    Create() {
        System.out.print("1 ");
        }
        // Create(int num) {
        // System.out.print("2 "); // with this commented output is 3 4
        // }
        Create(Integer num) {
        System.out.print("3 ");
        }
        Create(Object num) {
        System.out.print("4 ");
        }
        Create(int... nums) {
        System.out.print("5 ");
        }
        public static void main(String[] args) {
        new Create(100);
        new Create(1000L);
        // with the uncommented code it will be 2 4s
        }
}
