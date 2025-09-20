import java.util.Comparator;

// Vamos utilizar o Email como critério de comparação.
// Implementa a interface Comparator para comparar objetos Medico pelo campo email.
public class MedicoEmailComparator implements Comparator<Medico> {
    @Override
    public int compare(Medico m1, Medico m2) {
        return m1.getEmail().compareToIgnoreCase(m2.getEmail());
    }
}
