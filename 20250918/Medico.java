public class Medico implements Comparable<Medico> {

    private Long codigo; 
    private String nomeCompleto;
    private String especialidade;
    private String crm;
    private String email; // Novo atributo

    public Medico(Long codigo, String nomeCompleto, String especialidade, String crm, String email) { // Adicionado ao construtor
        if (!ValidaCRM.isValid(crm)) {
            throw new IllegalArgumentException("CRM inválido! Verifique o formato e o estado. Exemplo: 123456SP");
        }
        if (!ValidaEmail.isValid(email)) {
            throw new IllegalArgumentException("O email '" + email + "' não é válido.");
        }

        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.especialidade = especialidade;
        this.crm = crm;
        this.email = email; // Atribuir o novo valor
    }

    // Getters e Setters


    public long getCodigo(long codigo) {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (!ValidaCRM.isValid(crm)) {
            throw new IllegalArgumentException("CRM inválido. Verifique o formato e o estado.");
        }
        this.crm = crm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public int compareTo(Medico outroMedico) {
        return this.crm.compareTo(outroMedico.getCrm());
    }

    @Override
    public String toString() {
        System.out.println(" ");
        return "\n Medico{" +
                "codigo=" + codigo +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Long getCodigo() { 
        return codigo; 
    }
    public void setCodigo(Long codigo) { 
        this.codigo = codigo; 
    }
    public String getNomeCompleto() { 
        return nomeCompleto; 
    }
    public void setNomeCompleto(String nomeCompleto) { 
        this.nomeCompleto = nomeCompleto; 
    }
    public String getEspecialidade() { 
        return especialidade; 
    }
    public void setEspecialidade(String especialidade) { 
        this.especialidade = especialidade; 
    }
}