import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName, passCode;
        Scanner inp = new Scanner(System.in);
        int passRight =3;
        int addMoney=0, total=2000;
        int option;

        while (passRight>=1) {
            System.out.print("Kullanici adi gir : ");
            userName = inp.nextLine();
            System.out.print("Parola gir : ");
            passCode = inp.nextLine();

            if (userName.equals("Patika") && passCode.equals("dev123")){
                do {
                    System.out.print("1- Para yatirma\n" +
                            "2- Para cekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Exit\n" +
                            "islemi Seciniz :");
                    option = inp.nextInt();
                    switch (option){
                        case 1: System.out.print("Yatirilacak tutar : ");
                            addMoney = inp.nextInt();
                            total+=addMoney;
                            break;
                        case 2: System.out.print("Cekilecek tutar : ");
                            addMoney = inp.nextInt();
                            if (addMoney>total) System.out.println("Bakiye yetersiz...");
                            else total-=addMoney;
                            break;
                        case 3: System.out.println("Hesabinizdaki tutar : "+ total);
                            break;
                        case 4: System.out.print("Yine bekleriz..");
                            break;
                }

                } while (option!=4); break;
            } else {passRight--;
                System.out.println("Hatali giris");
                if (passRight==0) {System.out.println("Kartiniz bloke oldu");}
                else System.out.println("kalan deneme"+passRight);

            }
        }
    }
}