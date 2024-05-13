package Chap5.Quest;

public interface Aquatic {
    public default int getNumberOfGills(int input) { return 2; }
}
