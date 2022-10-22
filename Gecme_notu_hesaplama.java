
package gecme_notu_hesaplama;
import java.util.Scanner;


public class Gecme_notu_hesaplama {

    /*
    87-100: AA
    81-87 : BA
    74-80 : BB
    67-73 : CB
    60-66 : CC
    53-59 : DC
    46-52 : DD
    39-45 : FD
    0 -38 : FF
    */
    //Vize1 %30 -- Vize2 %30 --Final %40
    //Geçme Notu = 60;
    
    public static void main(String[] args) {
     
        Scanner input =new Scanner(System.in);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Üniversite Not Hesaplama Uygulamasına Hoş Geldiniz...");
        
        System.out.println("Vize 1 Notunuzu Giriniz :");
        int vize1 = input.nextInt();
        
        System.out.println("Vize 2 Notunuzu Giriniz :");
        int vize2 = input.nextInt();
        
        System.out.println("Final Notunuzu Giriniz :");
        int fnl = input.nextInt();
        
        double toplam =(((vize1)*30/100) + ((vize2)*30/100) + ((fnl)*40/100));
        
        if (toplam >= 87) {
            System.out.println("AA Harf Notu İle Geçtiniz Ve Derste Başarılı oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >=81 && toplam<87) {
            System.out.println("BA Harf Notu İle Geçtiniz Ve Derste Başarılı Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 74 && toplam <80) {
            System.out.println("BB Harf Notu İle Geçtiniz Ve Derste Başarılı Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 67 && toplam <73) {
            System.out.println("CB Harf Notu İle Geçtiniz Ve Derste Başarılı Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 60 && toplam <66) {
            System.out.println("CC Harf Notu İle Geçtiniz Ve Derste Başarılı Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 53 && toplam <59) {
            System.out.println("DC Harf Notu İle Başarısız Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 46 && toplam <52) {
            System.out.println("DD Harf Notu İle Başarısız Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else if (toplam >= 39 && toplam <45) {
            System.out.println("FD Harf Notu İle Başarısız Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        else {
            System.out.println("FF Harf Notu İle Başarısız Oldunuz . 100'Lük Sisteme Göre Notunuz :" +toplam);
        }
        
        System.out.println("Uygulamamızı Kullandığınız İçin Teşekkür Ederiz .");
        System.out.println("--------------------------------------------------");
       
        
    }
    
}
