package inheritance.hybridInheritance;

import inheritance.hybridInheritance.Cat;
import inheritance.hybridInheritance.Dog;
import inheritance.hybridInheritance.Octopus;

public class InheritanceTest {

    public static void main(String[] args) {

        Dog pet1=new Dog();
        pet1.setName("Piku");
        pet1.displayName();
        pet1.eat();
        pet1.setNoOfHeart(1);
        pet1.displayNoHeart();


        System.out.println("**************************************************");
        Cat pet2=new Cat();
        pet2.setName("Kiku");
        pet2.displayName();
        pet2.eat();
        pet2.setNoOfHeart(1);
        pet2.displayNoHeart();

        System.out.println("**************************************************");
        Octopus octopus=new Octopus();
        octopus.setName("octopus");
        octopus.displayName();
        octopus.eat();
        octopus.setNoOfHeart(4);
        octopus.displayNoHeart();
    }
}
