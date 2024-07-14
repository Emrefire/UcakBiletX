import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            double yasindirim,toplamtutar,normaltutar,gitdonindirim;
            int mesafe,yas,yolcutip;
            double mesafeucret = 0.10;
            Scanner inp = new Scanner(System.in);
            System.out.print("Mesafeyi km türünden giriniz: ");
            mesafe = inp.nextInt();
            System.out.print("Yaşınızı giriniz: ");
            yas = inp.nextInt();
            System.out.println("Yolculuk tipinizi giriniz (1 => Tek yön , 2 => Gidiş Dönüş ): ");
            yolcutip = inp.nextInt();
            if(mesafe > 0 && yas > 0 && yolcutip == 1 || yolcutip == 2){
                normaltutar = mesafe * mesafeucret;
                if(yas < 12){
                    yasindirim = normaltutar - 0.50;
                }
                else if (yas >12 && yas < 24 ) {
                    yasindirim = normaltutar - 0.10;
                }
                else if (yas > 65) {
                    yasindirim = normaltutar - 0.30;
                }else{
                    yasindirim = 0;
                }
                normaltutar = normaltutar - yasindirim;
                if(yolcutip == 2){
                    gitdonindirim = normaltutar * 0.20;
                    toplamtutar = (normaltutar-gitdonindirim)*2;
                    System.out.print("Toplam tutar: " + toplamtutar);
                }
                else{
                    System.out.println("Toplam tutar:" + normaltutar);
                }
            }
            else{
                System.out.println("Eksik yada Hatalı Girdiniz!");
            }



    }
}