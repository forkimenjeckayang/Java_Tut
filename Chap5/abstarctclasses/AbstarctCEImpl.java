package Chap5.abstarctclasses;

public class AbstarctCEImpl extends AstractCE {
    /*
     * since this class extends the AstractCE class, it implements all static methods and also
     * methods from the AstractC class since the AstractCE class extends from it too.
     */
    @Override
    public String sayHi() {
        return "Greetings User";
    }

    // @Override
    // public String setName(String Name) {
    //     this.Name = Name;
    //     return Name;
    // }
    
    /*
     * this concrete class is not required to provide an implemenation of the  setName from the other concrete
     * class if the setName methods is already implemented in the intermediate  astract class
     * AbstarctCEImpl inherits only one abstract method,
     * sayHi(), and is not required to provide an implementation for the method setName().
     */
}
