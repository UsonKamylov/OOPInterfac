public class Bun implements Baked{
    @Override
    public void sold() {
        System.out.println("the bun is over");
    }

    @Override
    public String tastier() {
        return "bun tastier";
    }
}
