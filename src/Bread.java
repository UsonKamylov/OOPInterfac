public class Bread  implements Baked{


    @Override
    public void sold() {
        System.out.println("Bread for sale");
    }

    @Override
    public String tastier() {
        return "The bread is deliciouns";
    }


}
