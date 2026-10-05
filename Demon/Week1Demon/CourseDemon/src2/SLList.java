public class SLList<Adastra> {
    // # Singly Linked List #

    // declaring a reference variable
    // private stop the user to access
    // <>change> # private IntNode first;

    /* Invariants
       * the first item,if it exists, is at sentinel.next
            // Generics
            ** Achieve consistency in information processing or improve processing speed
            ** by increasing the volume of information(storage),specifically trough packaging or adding entries                                                                             */
    private IntNode sentinel;

    // keep track the size instead of return by recursive function
    private int size;


    /* Constructor
        * construct a class (which has a non_static variable bound to a class)
        * which will bind the placeholder type to the class of this.first(the item variable of class of IntNode)                                                      */
    public SLList(Adastra x) {
        this.sentinel = new IntNode(null, null);
        // copy the address IntNode to the first, which is a non-static variable, of an object
        // <change> the first -> the sentinel
        this.sentinel.next = new IntNode(x, null);
        // initialize the size variable
        this.size = 1;
    }

    // create an empty SLList
    public SLList() {
        // change the first = null;
        sentinel = new IntNode(null, null);
        // sentinel SLList is virtual,it is means that it has size of zero,
        // which is directing to situation (that storage the null)
        size = 0;

    }

    // non-static method(which is a function to class SLList)
    // return void, input integer x -> input Placeholder type(Adastra)
    public void addFirst(Adastra x) {
        // copy the address of an object(the class of IntNode(x, this.first)) to the non-static variable this.first of an object
        // <change> # this.first = new IntNode(x, this.first);
        sentinel.next = new IntNode(x, sentinel.next);
        this.size ++;
    }

    // non-static method of the object(from SLList)
    //return integer -> return Placeholder type(Adastra)
    public Adastra getFirst() {
        // <change> # return this.first.item;
        return sentinel.next.item;
    }

    // non-static method of the object(SLList)
    // return null, input integer -> input placeholder type(Adastra)
    public void addLast(Adastra x) {
        // working storage
        // <change> # IntNode storage = this.first;
        IntNode storage = sentinel;
        this.size ++;

        /* delete all of these,which all created since the "original null"
        if (this.first == null) {
            this.first = new IntNode(x, null);
            return;}
        */

        // based on the sentinel(a unified launcher),(by sentinel.next) to access the next totally
        while (storage.next != null) {
            storage = storage.next;
        }
        storage.next = new IntNode(x, null);

    }

/*  have been turn the size method in a way more efficiency

    public int size() {
        return this.size0(this.first);
    }
    // private non-static method
    // return integer, input an object (form the class IntNode)
    private int size0(IntNode p) {
        if (p == null) {
            return 0;
        }
        return 1 + this.size0(p.next);
    }
*/
    public int size() {
        return this.size;
    }

    // NESTED CLASS
    // public -> private
    // non-static -> static
    private class IntNode {
        // declaring the non-static variable
        // change int to Placeholder to represent any possible type
            // <change> (public int item) -> public Adastra item
        public Adastra item;
        public IntNode next;

        // constructor
        // input a type of placeholder
        public IntNode(Adastra i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    public static void main(String[] args) {
        SLList<String> L = new SLList<String>();
        L.addFirst("I");
        L.addLast("Love");
        System.out.println(L.getFirst());

        SLList<Integer> L2 = new SLList<>();
        L2.addLast(5);
    }

}

