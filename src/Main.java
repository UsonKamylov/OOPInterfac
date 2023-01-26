public class Main {
    public static void main(String[] args) {

//        Swimable [] okianrium={
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Duckt(),
//                new Duckt(),
//                new Duckt(),
//                new Duckt(),
//                new Duckt(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//        };
//        for (Swimable sox:okianrium) {
//            sox.swim();
//
//        }

        Bread bread=new Bread();
        bread.sold();
        System.out.println(bread.tastier());
        Pie pie=new Pie();
        pie.sold();
        System.out.println(pie.tastier());
        Bun bun=new Bun();
        bun.sold();
        System.out.println(bun.tastier());


    }
}