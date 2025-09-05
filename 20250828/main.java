public class main {
    public static void main(String[] args) {
        
        ArvoreBinaria<Medico> arvore = new ArvoreBinaria<>();

        //Inserindo médicos na árvore
        arvore.inserir(new Medico("Ana Silva", "Cardiologia", "123456SP"));
        arvore.inserir(new Medico("Roberto Carlos", "Oftalmologista", "123456MG"));
        arvore.inserir(new Medico("Maria Oliveira", "Dermatologia", "123456RJ"));
        arvore.inserir(new Medico("Carlos Souza", "Pediatria", "123456BA"));
        arvore.inserir(new Medico("Fernanda Lima", "Neurologia", "123456RS"));
        arvore.inserir(new Medico("Paula Mendes", "Ortopedia", "123456DF"));
        arvore.inserir(new Medico("João Pereira", "Ginecologia", "123456PR"));
        arvore.inserir(new Medico("Lucas Fernandes", "Psiquiatria", "123456ES"));
        arvore.inserir(new Medico("Mariana Costa", "Endocrinologia", "123456CE"));
        arvore.inserir(new Medico("Ricardo Alves", "Urologia", "123456PE"));
    
        System.out.println("\n--- Impressão da Árvore ---");
        System.out.println();

        System.out.print("Caminhamento Pré-Fixado (Raiz, Esquerda, Direita): ");
        arvore.imprimePreFixado();
        System.out.println(); 
        System.out.println();

        System.out.print("Caminhamento Em Ordem (Esquerda, Raiz, Direita): ");
        arvore.imprimeEmOrdem();
        System.out.println();
        System.out.println();

        System.out.print("Caminhamento Pós-Fixado (Esquerda, Direita, Raiz): ");
        arvore.imprimePosFixado();
        System.out.println();
        System.out.println();

    }
}
