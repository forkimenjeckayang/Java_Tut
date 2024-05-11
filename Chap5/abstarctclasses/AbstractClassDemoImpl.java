package Chap5.abstarctclasses;

public class AbstractClassDemoImpl extends AbstractClassDemo{
    /*
     * we have an cocncrete class AbstractClassDemoImpl becasue it extends
     * AbstractClassDemo abtract class and implements the abstract methods
     */
     public String setName(String Name){
         this.Name = Name;
         return Name;
     }
}
