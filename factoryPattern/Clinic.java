package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null;
            String animal = null;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    animal = "dog";
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;

                case 2:
                    pet = new Cat();
                    animal = "cat";
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;

                case 3:
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid choice, please try again. \n");
            }

            if (choice == 1 || choice == 2) {
                System.out.println();
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());

                if (animal == "cat") {
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                } else if (animal == "dog") {
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                }

                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println();
            }
        }
    }
}