//Jose Guadarrama
//SDD 315; Found of Object-Oriented Program
//Program 12 - Design Pattern [FACTORY DESIGN PATTERN]
//Original Programmer Alvin Alexander; July 5, 2017 --- A Java Factory Pattern example

interface Car
{
  public void speak ();
}

class Civic implements Car
{
  public void speak()
  {
    System.out.println("The Civic says \"vroom\"");
  }
}

class Mustang implements Car
{
  public void speak()
  {
    System.out.println("The Mustang says (in a very deep trottle) \"ggRRROARR!\"");
  }
}

class lightning_mcqueen implements Car
{
  public void speak()
  {
    System.out.println("Lightning Mcqueen says \"KA-CHOWW\"");
  }
}

//Each of these concrete classes (Civic, Mustang, and lightning_mcqueen) 
//implements "Car interface", which is the key point of the Factory Pattern

class CarFactory
{
  public static Car getCar(String criteria)
  {
    if ( criteria.equals("smallCar") )
      return new Civic();
    else if ( criteria.equals("bigCar") )
      return new Mustang();
    else if ( criteria.equals("pixarFilms") )
      return new lightning_mcqueen();

    return null;
  }
}

public class Factory
{
  public static void main(String[] args)
  {
    // create a small Car
    Car Car = CarFactory.getCar("smallCar");
    Car.speak();

    // create a big Car
    Car = CarFactory.getCar("bigCar");
    Car.speak();

    // create a working Car
    Car = CarFactory.getCar("pixarFilms");
    Car.speak();
  }
}