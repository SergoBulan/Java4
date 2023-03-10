package HomeMvn.ListBookMag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {

    private String name;
    private int pages;


    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " : " + this.name + " - " + this.pages + " сторінок");
    }
}

