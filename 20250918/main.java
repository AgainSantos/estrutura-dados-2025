import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
    List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(1L, "Ana Silva", "Cardiologia", "123456SP", "aninha@gmail.com"));
        medicos.add(new Medico(2L, "Roberto Carlos", "Oftalmologista", "123456MG","robertao12@gmail.com"));
        medicos.add(new Medico(3L, "Maria Oliveira", "Dermatologia", "123456RJ", "mariazona@yahoo.com"));
        medicos.add(new Medico(4L, "Carlos Souza", "Pediatria", "123456BA", "souzones@gmail.com"));
        medicos.add(new Medico(5L, "Fernanda Lima", "Neurologia", "123456RS", "limazeira@gmail.com"));
        medicos.add(new Medico(6L, "Paula Mendes", "Ortopedia", "123456DF", "gokucareca@gmail.com"));
        medicos.add(new Medico(7L, "João Pereira", "Ginecologia", "123456PR", "jaozao@gmail.com"));
        medicos.add(new Medico(8L, "Lucas Fernandes", "Psiquiatria", "123456ES","Lukaku@yahoo.com"));
        medicos.add(new Medico(9L, "Mariana Costa", "Endocrinologia", "123456CE", "Mahcostas@gmail.com"));
        medicos.add(new Medico(10L, "Ricardo Alves", "Urologia", "123456PE","riconsios@outlook.com"));
    
    ArvoreBinaria<Medico> arvorePorCRM = new ArvoreBinaria<>();
    ArvoreBinariaAlternativa<Medico> arvorePorEmail = new ArvoreBinariaAlternativa<>(new MedicoEmailComparator());

    for (Medico medico : medicos) {
        arvorePorCRM.inserir(medico);
        arvorePorEmail.inserir(medico);
    }

    // OBS 1: A ÁRVORE DE CRM BUSCA USANDO O MÉTODO compareTo DA CLASSE MEDICO.
    // OBS 2: A ÁRVORE DE EMAIL BUSCA USANDO O COMPARATOR DA CLASSE MEDICOEMAILCOMPARATOR.

    System.out.println("\n Árvore Binária de Busca por CRM (em ordem):");
    arvorePorCRM.imprimeEmOrdem();
    System.out.println(" ");

    System.out.println("\n Árvore Binária de Busca por Email (em ordem):");
    arvorePorEmail.imprimeEmOrdem();
    System.out.println(" ");

    arvorePorCRM.remover(medicos.get(3)); // Remove Carlos Souza
    arvorePorEmail.remover(medicos.get(3)); // Remove Carlos Souza

    System.out.println(" ");
    arvorePorCRM.pesquisa(medicos.get(3)); // Pesquisa Carlos Souza
    arvorePorEmail.pesquisa(medicos.get(3)); // Pesquisa Carlos Souza

    System.out.println();

    arvorePorCRM.pesquisa(medicos.get(5)); // Pesquisa Paula Mendes (via CRM)
    arvorePorEmail.pesquisa(medicos.get(5)); // Pesquisa Paula Mendes (via Email)

    System.out.println("\n Árvore Binária de Busca por CRM (Pré fixado):");
    arvorePorCRM.imprimePreFixado();
    System.out.println(" ");

    System.out.println("\n Árvore Binária de Busca por Email (Pré fixado):");
    arvorePorEmail.imprimePreFixado();
    System.out.println(" ");

    System.out.println("\n Árvore Binária de Busca por CRM (Pós fixado):");
    arvorePorCRM.imprimePosFixado();
    System.out.println(" ");

    System.out.println("\n Árvore Binária de Busca por Email (Pós fixado):");
    arvorePorEmail.imprimePosFixado();
    System.out.println(" ");
}
}
