package Chap4.Constructor;

public class InitializationOrderSimple {

        private String name = "Torchie"; // initialized fith

        { System.out.println(name); } // initialized sixth so outputs Torchie

        private static int COUNT = 0; // initialized first

        static { System.out.println(COUNT); } // initialized second so prints out 0

        static { COUNT += 10; System.out.println(COUNT); } // initialized third so print outs 10

        public InitializationOrderSimple() { //initialized last so outputs constructor
            System.out.println("constructor");
        } 
 
        public static void main(String[] args){
            System.out.println("read the construct"); // initialized fourth ie after all the statics have been initialized
            InitializationOrderSimple init = new InitializationOrderSimple(); 
            /*
                output
                0
                10
                read the construct
                Torchie
                constructor
             */

        }
}
