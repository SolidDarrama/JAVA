//jose guadarrama
//11/14/2017
//Week 4 Programming Assignment 9
//inheritance/overload method/interfaceing/abstract-class
//Topic Vehicles

interface Color //interface
{
	void red();
	void blue();
	void silver();
}

abstract class SelectionColor implements Color //abstract class
{
	@Override
	public void red()
	{
		System.out.println("Vehicle's Color is Red");
	}
	@Override
	public void blue()
	{
		System.out.println("Vehicle's Color is Blue");
	}
	@Override
	public void silver()
	{
		System.out.println("Vehicle's Color is Silver");
	}
}

class Other extends SelectionColor
{
	public int autoSale(int i)//overload method
	{
		System.out.print("*NOTE: The Number of 2016 Models is :");
		return i - 2016;
	}
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
 class vehicles extends Other 
{
    public int autoSale(int i, int x)//overload method
    {
    	//basic honda features - for all hondas
        System.out.println("Multi-Angle Rearview Cameras \n"
        		+ "The Honda Sensing Technology Suite \n"
        		+ "The Vehicle Stability Assist System \n"
        		+ "Earth Dreams Fuel Efficiency Measures \n"
        		+ "The HondaLink System");
        return x - i;
    }
    
    public static void main(String[] args)
    {
    	Color x = new Other();
    	vehicles b = new vehicles();
    	
    	System.out.print((b.autoSale(2018)) + "\n\n");//first overload method
    	b.civic();
    	x.red();
    	System.out.print("The Newest to Oldest Models have a " + (b.autoSale(2009, 2016)) + " year difference\n\n");//second overload method
        b.accord();
        x.blue();
    	System.out.print("The Newest to Oldest Models have a " + (b.autoSale(2009, 2016)) + " year difference\n\n");//second overload method
        b.s2000();
        x.silver();
    	System.out.print("The Newest to Oldest Models have a " + (b.autoSale(2009, 2016)) + " year difference\n\n");//second overload method
    }
}