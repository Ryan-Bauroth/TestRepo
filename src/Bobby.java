public class Bobby {
    // encapsulates all these properties
    private String name;
    private int age;
    private boolean student;  // primagive data: holdover from c
    private double coolnessFactor; //camelCase naming convention
    public String toString(){
        return name + "is " + age + " years old and is " + (coolnessFactor*100) + "% cool";
    }
    /*
    primatives from C/C++
    int (short, int, long), double (float), bool, char (bunch of chars = string)

     */
    //ACCESSOR METHODS
    public String getName() { return name; }
    public int getAge() {return age;}
    /**
     * Parameterized constructor for class Bobby
     * @param na name
     * @param ag age
     * @param st student
     * @param cf coolness factor
     * @return
     */
    public Bobby(String na, int ag, boolean st, double cf){
        name = na; // ASSIGNMENT OPERATOR -- right-associative
        age = ag;
        student = st;
        coolnessFactor = cf;
    }

    /**
     * Main for class Bobby
     * @param args Command line
     */

    public static void main(String[] args){
        Bobby b = new Bobby("Methusalah", 969, true,.99);
        System.out.println(b);
    }
}
