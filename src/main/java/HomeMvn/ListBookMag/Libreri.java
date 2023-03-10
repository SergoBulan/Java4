package HomeMvn.ListBookMag;

import java.util.ArrayList;

public class Libreri {
    private static final ArrayList<Printable> libreris = new ArrayList<>();

    public static void add(Printable item){
        libreris.add(item);
    }
    public static void showBooks(){
        for (Printable item : libreris){
            if(item instanceof Book){
                item.print();
            }
        }
    }
    public static void showMagazine(){
        for (Printable item : libreris){
            if(item instanceof Magazine){
                item.print();
            }
        }
    }
}
