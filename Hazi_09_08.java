/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_08;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class Hazi_09_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Kocka       
        System.out.print("Hány cm a kocka éle? ");
        double kockaEl = sc.nextDouble();

        double kockaTerfogat = kockaEl * kockaEl * kockaEl;
        double kockaFelulet = kockaEl * kockaEl * 6;

        System.out.println("A kocka felülete: " + kockaFelulet + " ncm.");
        System.out.println("A kocka térfogata: " + kockaTerfogat + " kcm.");
//Teglalap       
        System.out.print("Hány cm a téglalap 1. éle? ");
        double teglalapEl1 = sc.nextDouble();

        System.out.print("Hány cm a téglalap 2. éle? ");
        double teglalapEl2 = sc.nextDouble();

        System.out.print("Hány cm a téglalap 3. éle? ");
        double teglalapEl3 = sc.nextDouble();

        double teglalapFelulet = 2 * teglalapEl1 * teglalapEl2 + 2 * teglalapEl2 * teglalapEl3 + 2 * teglalapEl3 * teglalapEl1;
        double teglalapTerfogat = teglalapEl1 * teglalapEl2 * teglalapEl3;

        System.out.println("A téglalap felülete: " + teglalapFelulet + " ncm.");
        System.out.println("A téglalap térfogata: " + teglalapTerfogat + " kcm.");
//Gömb
        System.out.print("Hány cm a gömb sugara? ");
        double gombSugar = sc.nextDouble();

        double gombFelulet = 4 * gombSugar * gombSugar * 3.14159;
        double gombTerfogat = (4 * gombSugar * gombSugar * gombSugar * 3.14159) / 3;

        System.out.println("A gömb felülete: " + gombFelulet + " ncm.");
        System.out.println("A gömb térfogata: " + gombTerfogat + " kcm.");
//lábváltó        
        System.out.println("Hány darab lábat akarsz átváltani? ");
        double lab = sc.nextInt();
        double merfold = (lab * 1.89) / 10000;
        double yard = lab * 0.33;
        double huvelyk = lab * 12;
        double line = lab * 120;

        System.out.println(lab + " láb "+ merfold + "mérföld.");
        System.out.println(lab + " láb " + yard + " yard.");
        System.out.println(lab + " láb "+ huvelyk+ " hüvelyk.");
        System.out.println(lab + " láb "+ line + " line.");
// tökéletes szám
        int szam;
        do{
        System.out.print("Írj be egy pozitív egész számot: ");
        szam = sc.nextInt();
        }while(szam < 0);
        int osztok = 0;
        for (int i = 1; i <= szam / 2; i++) {
            if (szam % i == 0) {
                osztok = osztok + i;
            }
        }
        if (osztok == szam) {
            System.out.println("A " + szam + " tökéletes szám.");
        } else {
            System.out.println("A " + szam + " nem tökéletes.");
        }
//barátságos szám
        int szam1;
        int szam2;
        do{
        System.out.print("Írj be egy pozitív egész számot: ");
        szam1 = sc.nextInt();
        System.out.print("Írj be egy másik pozitív egész számot: ");
        szam2 = sc.nextInt();
        }while (szam1< 0 && szam2 < 0);
        int osztok1 = 0;
        int osztok2 = 0;

        for (int i = 1; i <= szam1 / 2; i++) {
            if (szam1 % i == 0) {
                osztok1 = osztok1 + i;
            }
        }
        for (int j = 1; j <= szam2 / 2; j++) {
            if (szam2 % j == 0) {
                osztok2 = osztok2 + j;
            }
        }
        if (osztok1 == szam2 && osztok2 == szam1) {
            System.out.println("A " + szam1 + " és " + szam2 + " barátságos számok.");
        } else {
            System.out.println("A " + szam1 + " és " + szam2 + " nem barátságosak.");
        }
//double szorzatok
        int egesz = 0;
        double max = 0;
        double szorzat = 1;
        double osszeg = 0;
        double min = 0;
        double tiznelNagyobb = 0;
        do{
            System.out.println("Írj be egy pozitív egész számot: ");
            egesz = sc.nextInt();
        }while(egesz < 0);
        for(int i = 1; i <= egesz; i++){
            System.out.print(i + ". " + "Kérek egy double számot: ");
            double temp = sc.nextDouble();
            
            osszeg = osszeg + temp;
            szorzat = szorzat * temp;
            
            if (i == 1){
                min = temp;
                max = temp;
            }else{
                if(temp > max){
                max = temp;
               }else if (temp < min){
                min = temp;
               }
            if (temp > 10){
                tiznelNagyobb++;
            }
            }
    }
        System.out.println("A szorzatuk: " + szorzat);
        System.out.println("Az összegük: "+ osszeg);
        System.out.println("A legnagyobb szám a " + max + " volt.");
        System.out.println("A legkisebb szám a " + min + " volt.");
        System.out.println(tiznelNagyobb +" darab 10-nél nagyobb szám volt.");
//    //7-es számjegy
        System.out.print("Írj be egy pozitív egész számot: ");
        int pozitivEgesz = sc.nextInt();
        
        for (int i = 1; i < pozitivEgesz; i=i*10){
            int pozitivEgeszHanyados = pozitivEgesz / i;
           
            if (pozitivEgeszHanyados % 10 == 7){
                System.out.println("AZ " + i + " HELYIÉRTÉKEN VAN BENNE 7-ES SZÁMJEGY!");
            }else
                System.out.println("Az " + i + " helyiértéken nincs benne 7-es számjegy!");
        }
//átváltó
        byte valasz;
        do {
        System.out.println("Milyen mértékegységet szeretnél átváltani?");
        System.out.println("1.) Mérföld.");
        System.out.println("2.) Yard.");
        System.out.println("3.) Láb.");
        System.out.println("4.) Hüvelyk.");
        System.out.println("5.) Line.");
        valasz = sc.nextByte();
        }while (5 < valasz || valasz < 1);
        switch (valasz){
            case 1:
                System.out.print("Hány mérföldet váltsak át? ");
                double merf = sc.nextDouble();
                System.out.println("Ez " + (merf * 1760) + " yard");
                System.out.println("Ez " + (merf * 5280) + " láb");
                System.out.println("Ez " + (merf * 63360) + " hüvelyk");
                System.out.println("Ez " + (merf * 633600) + " line");
                break;
            case 2:
                System.out.print("Hány yardot váltsak át? ");
                double yar = sc.nextDouble();
                System.out.println("Ez " + (yar * 5.68*0.0001) + " mérföld");
                System.out.println("Ez " + (yar * 3) + " láb");
                System.out.println("Ez " + (yar * 36) + " hüvelyk");
                System.out.println("Ez " + (yar * 361) + " line");
                break;
            case 3:
                System.out.print("Hány lábat váltsak át? ");
                double foot = sc.nextDouble();
                System.out.println("Ez " + (foot * 1.89 *0.0001) + " merföld");
                System.out.println("Ez " + (foot * 0.33) + "  yard");
                System.out.println("Ez " + (foot*  12) + " Hüvelyk");
                System.out.println("Ez " + (foot* 120) + " Line");
                break;
            case 4:
                System.out.print("Hány hüvelyket váltsak át? ");
                double huvely = sc.nextDouble();
                System.out.println("Ez " + (huvely * 1.58*0.00001) + " mérföld");
                System.out.println("Ez " + (huvely * 0.03) + " yard");
                System.out.println("Ez " + (huvely * 0.08) + " láb");
                System.out.println("Ez " + (huvely * 10) + " line");
                break;
                case 5:
                System.out.print("Hány line-t váltsak át? ");
                double lin = sc.nextDouble();
                System.out.println("Ez " + (lin * 1.58*0.000001) + "  mérföld");
                System.out.println("Ez " + (lin * 2.78*0.001) + " yard");
                System.out.println("Ez " + (lin * 0.01) + " láb");
                System.out.println("Ez " + (lin * 0.1) + "  hüvelyk");
                break;
                default:
                    System.out.println("Érvényes választ adj!");
                
        }
        } 
    }

  
