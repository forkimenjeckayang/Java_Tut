package Chap4.Quest;

public class SecretImpl implements Secret {

    public static void main(String[] args) {
        // Secret secret = (e) -> { String e = ""; return "Poof" }; // mising semicolon in return statement and e is duplicated
        //Secret secret = (e) -> { String f = ""; return "Poof"; }; // works fine
        //Secret secret = (e) -> { String e = ""; "Poof" }; // duplicate varibale, no return statement and ";"
        Secret secret = (e) -> "Poof"; // works fine, no braces so no return statement
        // Secret secret = new Secret() {

        //     @Override
        //     public String magic(double d) {
        //         return "secret";
        //     }
        // };
  
    }
    @Override
    public String magic(double d) {
        return "secret";
    }
    
}
