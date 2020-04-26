/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diziler11;

import java.util.Arrays;

public class Diziler11 {
static int[][] ikiBoyutDizi;
public static void diziOlustur (int boyut1, int boyut2 ){
ikiBoyutDizi=new int[boyut1][boyut2];

for (int b=0; b<boyut1;b++){

    for (int c=0;c<boyut2;c++){
    
    ikiBoyutDizi[b][c]=b+c;
    }
} 

}

public static void diziEkranaYaz(int[][] cokboyutDizi){
    
for (int b=0; b<cokboyutDizi.length;b++){

    for (int c=0;c<cokboyutDizi[0].length;c++){
    
    System.out.print(cokboyutDizi[b][c]+"   ");
    }
    System.out.println();
} 

System.out.println(cokboyutDizi[0].length);
}

    public static void main(String[] args) {
    int[] listNum = {77,2,5,7,44,9,10};
    int[] listNum2 = new int[5];
    
        
        for (int i=0; i<listNum.length; i++)
        {
            System.out.println("Dizi elemanı"+i+":" + listNum[i]);
         
        }
        
        
        int [] yeni_dizi= new int[listNum.length];
        Arrays.sort(listNum);    
        //listNum=new int[listNum.length*2];
        System.arraycopy(listNum, 0, yeni_dizi, 0, 5);
        System.out.println(yeni_dizi[0]);
        //System.arrays.sort(listNum);
        
        
        int[] listNum3 = {5,7,9,11,13};         
        int deger = Arrays.binarySearch(listNum3, 13);
        
            if(deger> -1) //büyükse değer bulunmuştur.
                System.out.println("Aranan sayının indisi: " + deger);
            else
                System.out.println("Aranan değer bulunamadı");

            String[] bookList = new String[3];
            bookList[0] = "Pamuk";
            bookList[1] = "Güller";
            bookList[2] = "Bülbül";
            // 3 elemanlı bir dizi tanımladık. Bu diziye;

            bookList=new String[8]; //Yeniden boyutlandırma ile 8 eleman

            bookList[3] = "Tarih";

            System.out.println(Arrays.toString(bookList));
            System.out.println("İlk eleman: "+ bookList[1]+"  Son eklenen: "+ bookList[3]);
System.out.println("Dizi oluşturuluyor...");
diziOlustur(8,4);
System.out.println("Dizi ekrana yazdırılıyor...");
diziEkranaYaz(ikiBoyutDizi);

}
}