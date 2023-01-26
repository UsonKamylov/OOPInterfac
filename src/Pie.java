public class Pie implements Baked {
    @Override
    public void sold() {
        System.out.println("The will be a pie Tomorow");

    }

    @Override
    public String tastier() {
        return "Yesterday is pie was delicious";
    }
}
