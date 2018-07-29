public class Sandwich

{

    private Bread bread;

    private Sandwich filling;

    public Sandwich(String bread, int breadCal, String filling, int fillingCal)

    {

        this.bread = new Bread(bread, breadCal);

        this.filling = new Sandwich(filling, fillingCal);

    }

    public Bread getBread()

    {

        return bread;

    }

    public Sandwich getSandwich()

    {

        return filling;

    }

}
