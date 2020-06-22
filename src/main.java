public class main {
    public static void main(String[] args) {
        System.out.println("Kamen rider Decade");
        System.out.println("---------------------");
        KamenRider dcd = new KamenRider();
        dcd.data(40,35);
        dcd.data(70.0,20.0);
        dcd.data(100,50,50);
        dcd.data(70,90.0);
        dcd.data(55.0,80);
        System.out.println("--------------------");

        System.out.println("Kamen rider Zio");
        System.out.println("--------------------");
        KamenRider zio = new KamenRider();
        dcd.data(55,35);
        dcd.data(85.0,20.9);
        dcd.data(100,70,50);
        dcd.data(90,85.0);
        dcd.data(35.0,80);
        System.out.println("---------------------");

        System.out.println("Kamen rider Hibiki");
        System.out.println("---------------------");
        dcd.data(35,35);
        dcd.data(50.0,23.8);
        dcd.data(75,25,50);
        dcd.data(55,75.5);
        dcd.data(53.4,80);
        System.out.println("----------------------");
    }
}
