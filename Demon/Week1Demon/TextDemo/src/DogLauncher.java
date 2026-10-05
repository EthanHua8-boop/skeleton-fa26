public class DogLauncher {
    /* before java 25 we can write void main() instead of,
    * public static void main(Sting[] args)
    * public: Indicates that this class or method can be used by any class
    * static: It is a static method, not associated with any particular instance
    * void: It has no return type
    * main: This is the name of the method
    * String[] args: This is a parameter that is passed to the main method
    */

    /* main is called by the java interpreter itself rather than java class
            // it is interpreter's job to supply these arguments
            // they refer usually to the command line arguments
    */
        public static void main(String[] args) {
        Dog d = new Dog(20);
        Dog d2 = new Dog(100);
        // using method
        d.makeNoise();
        // using static method
        Dog.maxDog(d, d2);
        // using non-static method
        d.maxDog(d2);
        }
    }

