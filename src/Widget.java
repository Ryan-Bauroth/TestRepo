/**
 * Widget class represents a simple product for testing
 * @version 09.15.22
 * @author 25bauroth
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;
    /**
     * Parameterized constructor for class Widget
     * @param n A string for the name value
     * @param i an int for the ID value
     * @param c A double for the cost value
     */
    public Widget(String n, int i, double c)    {
        name = n;
        ID = i;
        cost = c;
    }
    public Widget(){
        name = "";
        ID = 0;
        cost = 0;
    }
    public String toString(){
        return name + "\t" + ID + "\t$" + cost;
    }

    /** Main method for class widget
     * @param args Command-line args, if needed.
     */
    public static void main(String[] args) {
        Widget w = new Widget("waffle", 123, .75);
        Widget myBad = new Widget();
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println(w);
        System.out.println(myBad);
    }
}
