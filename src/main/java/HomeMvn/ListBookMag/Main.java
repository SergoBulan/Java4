package HomeMvn.ListBookMag;

import HomeMvn.ListBookMag.Book;
import HomeMvn.ListBookMag.Libreri;
import HomeMvn.ListBookMag.Magazine;

public class Main {
    public static void main(String[] args) {
        Libreri.add(new Book("Garri Potter",600));
        Libreri.add(new Book("Kamasutra",80));
        Libreri.add(new Book("Kobzar",400));
        Libreri.add(new Book("Statut ZSU",350));
        Libreri.add(new Book("Forrest Gump",531));
        Libreri.add(new Magazine("Playboy","Erotic"));
        Libreri.add(new Magazine("Vesti","News"));
        Libreri.add(new Magazine("Comics","Fantasy"));

        Libreri.showBooks();
        Libreri.showMagazine();
    }



}
