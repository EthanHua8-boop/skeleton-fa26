/*
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (this == null) {
            return 0;
        }
        else {
            return 1 + this.rest.size();
        }
    }

    public int using_while_loop_size() {
        int totalSize = 0;
        IntList p = this;

        while (this != null) {
            totalSize ++;
            p = p.rest;
        }
        return totalSize;
    }


    public int get_using_while_loop(int i) {
        IntList p = this;

        while (i != 0) {
            i --;
            p = p.rest;
        }
        return p.first;
    }


    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        else {
            return this.rest.get(i - 1);
        }
    }


    public static void main(String[] args) {
        //
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        //
       IntList M = new IntList(5, new IntList(10, new IntList(15, null)));
    }
}
*/