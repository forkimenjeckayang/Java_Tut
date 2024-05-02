public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.setName("Forkim");
        System.out.println(m.getName());
    }

    String name;

    /**
    This is a java doc comment
    @param name
     */

    //this is a single line comment

     /*
      this is a multi line comment
    */

    public void setName(String uname) {
        this.name = uname;
    }

    public String getName() {
        return name;
    }
}