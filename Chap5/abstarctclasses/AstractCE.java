package Chap5.abstarctclasses;

public abstract class AstractCE  extends AbstractC{
    /*
     * AstractCE extends AbstractC but is marked as abstract; therefore, it is
     * not required to provide an implementation for the setName() method.
     * same as it's own method sayHi();
     */
    public abstract String sayHi();

    @Override
    public String setName(String Name) {
        this.Name = Name;
        return Name;
    }
    /*
     * since this intermediate abtract class has implemented the setName() method,  no need
     * for the concrete class to implement it. It should focus on implementing just the sayHi 
     * method
     */
}
