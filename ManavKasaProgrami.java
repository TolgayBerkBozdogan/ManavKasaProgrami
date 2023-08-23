import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00, toplamtutar,p1,p2,p3,p4,p5;
        System.out.print("Kaç Kilo Armut Aldınız? :");
        p1 = input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız? :");
        p2 = input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız? :");
        p3 = input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız? :");
        p4 = input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız? :");
        p5 = input.nextDouble();

        toplamtutar= (armut*p1)+(elma*p2)+(domates*p3)+(muz*p4)+(patlican*p5);
        System.out.println("Toplam Tutar: "+toplamtutar);
    }
}
