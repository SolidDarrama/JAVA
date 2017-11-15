//jose guadarrama
//11/14/2017
//Week 4 Programming Assignment 4
//inheritance - Topic Vehicles


class ClassA 
{
    public void civic()
    {
        System.out.println("Civic 2016:\n158-horsepower 2.0-liter 4-cylinder");
    }
    public void accord()
    {
        System.out.println("Accord 2016:\n185-hp 2.4-liter 4-cylinder");
    }
    public void s2000()
    {
        System.out.println("S2000 2009:\n237–247 hp 2.0-liter 4-cyclinder\n"
        		+ "Body Style: 2-door convertible");
    }
}
public class vehicles extends ClassA 
{
    public void dispB()
    {
    	//basic honda features - for all hondas
        System.out.println("Multi-Angle Rearview Cameras \n"
        		+ "The Honda Sensing Technology Suite \n"
        		+ "The Vehicle Stability Assist System \n"
        		+ "Earth Dreams Fuel Efficiency Measures \n"
        		+ "The HondaLink System\n");
    }
    public static void main(String args[])
    {
        //Assigning ClassB object to ClassB reference
    	vehicles b = new vehicles();
        //call dispA() method of ClassA
        b.civic();
        //call dispB() method of ClassB
        b.dispB();
        
        b.accord();
        //call dispB() method of ClassB
        b.dispB();
        
        b.s2000();
        //call dispB() method of ClassB
        b.dispB();
    }
}