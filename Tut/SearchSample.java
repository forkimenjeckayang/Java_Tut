package Tut;

public class SearchSample {
    public static void main(String[] args) {
    int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
    int searchValue = 2;
    int positionX = -1;
    int positionY = -1;

    //we have a result to print out only when we leave the PARENT_LOOP
    PARENT_LOOP: for(int i=0; i<list.length; i++) {
    for(int j=0; j<list[i].length; j++) {
        if(list[i][j]==searchValue) {
        positionX = i;
        positionY = j;
        break;
        }
    }
    }
    if(positionX==-1 || positionY==-1) {
    System.out.println("Value "+searchValue+" not found");
    } else {
    System.out.println("Value "+searchValue+" found at: " +
    "("+positionX+","+positionY+")");
    }
    int m = 0;
    while(m++ < 10) {System.out.println(m);}
    String message = m > 10 ? "Greater than" : "false";
    System.out.println(message+","+m);

    int x = 4;
    long y = x * 4 - x++;
    if(y<10) System.out.println("Too Low");
    else System.out.println("Just right");
    // else System.out.println("Too High");

    /*
     * for the code below if x4>2 is false it will print 7 automatically
     * if x4>2 evaluates to true, it checks x4<4  and if it evaluates to true it prints 10
     * But if x4<4  evaluates to false it 8
     */
    int x4 = 1;
    System.out.println(x4 > 2 ? x4 < 4 ? 10 : 8 : 7);

    boolean x2 = true, z = true;
    int y1 = 20;
    x2 = (y1 != 10) ^ (z=false);
    System.out.println(x2+", "+y1+", "+z);

     byte a = 40, b = 50;
     byte sum = (byte) (a + b);
     System.out.println(sum);

    int x8 = 5 * 4 % 3;
    System.out.println(x8);

    long x6 = 0;
    double s = 2;
    if(x6 == s) System.out.println("Success");
    else System.out.println("Failure");

    int j = 4;
    int k = 7;

    j += k++;
    System.out.println(j);

    int l = 1, l1 = 15;
    while (l < 10) {
        l1--;
        l++;
    }
    System.out.println(l+", "+l1);


    boolean keepGoing = true;
    int result = 15, i2 = 10;

    do {
    i2--;
    if(i2==8) keepGoing = false;
    result -= 2;
    } while(keepGoing);
    System.out.println(result);

    int count = 0;
    ROW_LOOP: for(int row = 1; row <=3; row++)
    for(int col = 1; col <=2 ; col++) {
    if(row * col % 2 == 0) continue ROW_LOOP;
    count++;
    }
    System.out.println(count);

    int m0 = 9, n1 = 1, x0 = 0;
    while(m0 > n1) {
        m0--;
        n1 = n1 + 2;
        x0 = x0 + m0 + n1;
    }
    System.out.println(x0);
    }
    
    }
