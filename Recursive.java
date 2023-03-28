
package recursive;

import java.util.Scanner;

public class Recursive {
     
    static int sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayi:");
         int sayi1=input.nextInt();
            System.out.println("ikinci sayi:");
         int sayi2=input.nextInt();
        return sayi1+sayi2;
    }
    static int cikart(){
         Scanner input=new Scanner(System.in);
        System.out.println("ilk sayi:");
         int sayi1=input.nextInt();
            System.out.println("ikinci sayi:");
         int sayi2=input.nextInt();
    
        return sayi1-sayi2;
    }
    static int carp(){
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayi:");
         int sayi1=input.nextInt();
        System.out.println("ikinci sayi:");
         int sayi2=input.nextInt();
         
        return sayi1*sayi2;
    }
    static int bolme(){
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayi:");
         int sayi1=input.nextInt();
            System.out.println("ikinci sayi:");
         int sayi2=input.nextInt();

        return sayi1/sayi2;
    }
    static int us(){
        Scanner input=new Scanner(System.in);
        System.out.println("taban sayi:");
         int sayi1=input.nextInt();
            System.out.println("us sayi:");
         int sayi2=input.nextInt();
    
        int fak=1;
        for (int i = 1; i <= sayi2; i++) {
            fak*=sayi1;
        }
        return fak;
    }
    static int faktoryel(){
        Scanner input=new Scanner(System.in);
        System.out.println("hangi sayinin faktoryeli alinsin:");
       int a=input.nextInt();
       int fak=1;
        for (int i = a; i <= 1; i--) { 
            fak*=i;        
    }
        return fak;
    }
    static int mod(){
        Scanner input=new Scanner(System.in);
        System.out.println("hangi sayi :");
         int sayi1=input.nextInt();
            System.out.println("kaca göre modu:");
         int sayi2=input.nextInt();
         return sayi1%sayi2;
         
    }
        
    static void hesap(){
         Scanner input=new Scanner(System.in);
        System.out.println("uzun kenar :");
         int sayi1=input.nextInt();
            System.out.println("kisa kenar:");
         int sayi2=input.nextInt();
         int result= sayi1*sayi2 , result2=2*(sayi1+sayi2);
       
         System.out.println("alan "+result+"cevre: "+result2);
      
    }
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secim;
        String menu="""
                    1- Toplama islemi
                    2- cikarma islemi
                    3- carpma islemi
                    4- Bolme islemi
                    5- uslu Sayi Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dikdortgen Alan ve cevre Hesabi
                    9- cikis""";
        
        do {            
            System.out.println(menu);
            System.out.println("lütfen yapmak istediginiz islemi secin : ");
            secim=input.nextInt();
            
            
            switch (secim) {
                case 1:  System.out.println( sum());
                  break;
               
                case 2: System.out.println(cikart());  break;
                
                case 3: System.out.println(carp());;  break;
                
                case 4: System.out.println(bolme());; break;
                
                case 5:System.out.println(us());;  break;
                
                case 6: System.out.println(faktoryel());; break;
                
                case 7: System.out.println(mod()); break;
                
                case 8: hesap();
                       break;
                
                default:
                    System.out.println("cikis emri verdiniz..."); break;
            }
            
            
            
        } while (secim!=9);
        
        
        
        
        
    }
    
}
