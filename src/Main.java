public class Main {
    public static void main(String[] args) {

        Swimable [] okianrium={
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Duckt(),
                new Duckt(),
                new Duckt(),
                new Duckt(),
                new Duckt(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
        };
        for (Swimable sox:okianrium) {
            sox.swim();

        }




    }
}