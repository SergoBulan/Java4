package HomeMvn.ListBookMag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable {

    private String name;
    private String genre;

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " : " + this.name + " у жанрі " + this.genre);

    }
}
