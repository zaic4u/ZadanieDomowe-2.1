public class Idea {
    public static void main(String[] args) {
//    Mebel mebel1 = new Mebel ();
//     mebel1.wysokosc = 100;
//     mebel1.szerokosc = 185.25;
//     mebel1.dlugosc = 125.5;
//     mebel1.kolor = "czerwony";
//     mebel1.material = "jedwab";
//
//     Mebel mebel2 = new Mebel ();
//        mebel2.wysokosc = 250.25;
//        mebel2.szerokosc = 1855.35;
//        mebel2.dlugosc = 175.75;
//        mebel2.kolor = "niebieski";
//        mebel2.material = "bawelna";
//
//        System.out.println(mebel1.wysokosc);
//        System.out.println(mebel1.szerokosc);
//        System.out.println(mebel1.dlugosc);
//        System.out.println(mebel1.kolor);
//        System.out.println(mebel1.material);
//        System.out.println();
//        System.out.println(mebel2.wysokosc);
//        System.out.println(mebel2.szerokosc);
//        System.out.println(mebel2.dlugosc);
//        System.out.println(mebel2.kolor);
//        System.out.println(mebel2.material);

       Mebel mebel1 = new Mebel (35,263,456,"zolty", "len");
       System.out.println("Nowy mebel ma " + mebel1.wysokosc + " cm wys " + mebel1.szerokosc + " cm szerokosci." );

       Mebel mebel2 = new Mebel (25, 256,58.25, "fioletowy", "poliester");
        System.out.println("Ten mebel ma " + mebel2.dlugosc + " cm i " + mebel2.szerokosc + " cm szerokosci." );
    }

}

