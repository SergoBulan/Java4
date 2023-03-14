package HomeMvn.Lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListAlfavit {
    public static void main(String[] args) {
        List<String> alfavet = new ArrayList<>();
        alfavet.add("Rut");
        alfavet.add("Art");
        alfavet.add("Git");
        alfavet.add("Put");
        alfavet.add("Yet");
        alfavet.add("Just");
        alfavet.add("Corri");
        alfavet.add("Art");
        alfavet.add("Push");
        alfavet.add("Arrrr");
        alfavet.add("Eee babe");
        alfavet.add("Zero");
        alfavet.add("Puerto Riko");
        alfavet.add("Dildo");
        alfavet.add("Diablo");
        alfavet.add("Sword");
        alfavet.add("Dart Moll");
        alfavet.add("Fish");
        alfavet.add("Mind");



        alfavet.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(alfavet);



    }
}
