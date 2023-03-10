package HomeMvn.Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument {
    private int Chord;
    private int cost;

    @Override
    public void play() {
        System.out.println("Купив " + this.getClass().getSimpleName() + " яка має " + this.Chord + " струн і коштує " + this.cost);
    }
}
