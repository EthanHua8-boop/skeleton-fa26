public class Type {
    /* 1. Bit

        // the information is stored in memory as a sequence of ones and zeros

        // Java has a different way to interpret the bits
            * 8 primitive types in Java:  Byte,short,int,long,float,double,boolean,char
    */

    /* 2. Declaring a Variable (simplified)

        // when you declare a variable of a certain type in java
            * your computer sets aside exactly enough bits to hold a thing of that type
            * java creates an internal table that maps each variable name to a location
            * java does not write anything into the reserved boxes
     */

     /* 3. Assignment statement

        // given variables y and x
            * y = x copies all the bits from x into y
     */

    /* 4. Reference Types
    */

    /* 5. Class Instantiations
        // When we instantiate an Object
            * Java first allocates a box of bits for each instance variable of the class and fills them with a default value
            * The Constructor then usually fills every such box with some other value

        // new as returning the address of the newly created object
            * Addresses in Java are 64 bits
    */

    /* 6. Reference Type Variable Declarations
        // When we declare a variable of any reference(Walrus, Dog, Planet)
            * Java allocates exactly a box of size 64 bits, no matter what type of object
            * These bits can be either set to:
                ** Null(all zero)
                ** The 64 bit "address" of a specific instance of that class(return by NEW)
    */
}













