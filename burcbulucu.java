package Giris;
import java.util.Scanner;
public class burcbulucu {
    public static void main(String[] args) {
        int month,day;
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğdunuz günü 2 haneli olacak şekilde giriniz:");
        day=inp.nextInt();
        System.out.print("Doğdunuz ayı 2 haneli olacak şekilde giriniz:");
        month=inp.nextInt();
        if((month==3 && day>=21) || (month==4 && day<=20)){
            System.out.println("Burcunuz Koç Burcu");
        }else if((month==4 && day>=21) || (month==5 && day<=21)){
            System.out.println("Burcunuz Boğa Burcu");
        }else if((month==5 && day>=22) || (month==6 && day<=22)){
            System.out.println("Burcunuz İkizler Burcu");
        }else if((month==6 && day>=23) || (month==7 && day<=22)){
            System.out.println("Burcunuz Yengeç Burcu");
        }else if((month==7 && day>=23) || (month==8 && day<=22)){
            System.out.println("Burcunuz Aslan Burcu");
        }else if((month==8 && day>=23) || (month==9 && day<=22)){
            System.out.println("Burcunuz Başak Burcu");
        }else if((month==9 && day>=23) || (month==10 && day<=22)){
            System.out.println("Burcunuz Terazi Burcu");
        }else if((month==10 && day>=23) || (month==11 && day<=21)){
            System.out.println("Burcunuz Akrep Burcu");
        }else if((month==11 && day>=22) || (month==12 && day<=21)){
            System.out.println("Burcunuz Yay Burcu");
        }else if((month==12 && day>=22) || (month==1 && day<=21)){
            System.out.println("Burcunuz Oğlak Burcu");
        }else if((month==1 && day>=22) || (month==2 && day<=19)){
            System.out.println("Burcunuz Kova Burcu");
        }else if((month==2 && day>=20) || (month==3 && day<=20)){
            System.out.println("Burcunuz Balık Burcu");
        }

    }
}
