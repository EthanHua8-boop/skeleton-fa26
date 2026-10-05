public class Dog {
    // non-static variables
    public int weightInPounds;
    // static variables
    public static String binomen = "Canis familiaris";

    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            IO.println("yipyipyip");
        }
        else if (weightInPounds < 30) {
            IO.println("bark. bark.");
        }
        else {
            IO.println("woof!");
        }
    }
// static method
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
// non-static method
    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }
}
