public class Main {
    public static void main(String[] args) {

        Animal animalShark = new Shark();
        Animal animalEagle = new Eagle();
        Animal animalTurtle = new Turtle();

        Animal[] animals = {animalShark,animalEagle,animalTurtle};

        for (Animal animal : animals) {
            if (animal instanceof Animal){
                System.out.println(animal.getClass());
            }
        }
    }
}