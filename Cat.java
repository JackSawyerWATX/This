public class Cat {
    //Instance variable
     private String name;
     private String breed;
   
    //Creating a no-argument constructor that will utilize the this() keyword to call another constructor in the current Cat class instance
    public Cat() {
     //Invoke the parameterized constructor
     this("Marshmallow","Turkish Angora");
     System.out.println("Default Constructor");
    }
    
    //Creating a parameterized constructor which will intialize the name and breed variables.
    public Cat(String name, String breed) {
     this.name = name;
     this.breed = breed;
     System.out.println("Parameterized constructor");
    }
   
    public static void main(String args[]) {
     //Creating a object that utilized our no-argument constructor
     Cat cat = new Cat();
     //Look at what the name and breed of our cat object is
     System.out.println(cat.name);
     System.out.println(cat.breed);
     //creating a line break so you can see the two outcomes of the two objects
     System.out.println();
     //Creating another Cat object called cat2 utilizing the parameterized constructor.
     Cat cat2 = new Cat("Dixie", "Siamese");
     //Look at what the name and breed of our cat2 object is that utilized our parameterized constructor
     System.out.println(cat2.name);
     System.out.println(cat2.breed);
    }
   }