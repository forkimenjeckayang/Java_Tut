package Chap6.understandingexceptions;

public class Main {
// length of 0 means array is empty intially so getting an index of 0 is invalid and hence throw and exception
static String[] animals = new String[0];
//length of one now meaning it has one element in it beggining with index 0
static String[] animals1 = new String[1];
public static void main(String[] args) {
    System.out.println(animals);
    System.out.println(animals[0]);
}

}
