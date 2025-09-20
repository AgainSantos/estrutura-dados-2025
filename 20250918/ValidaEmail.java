import java.util.regex.Pattern;

public class ValidaEmail {

    /**
     * Expressão Regular (Regex) para validar a maioria dos formatos de e-mail comuns.
     * ^                  # Início da linha
     * [a-zA-Z0-9._%+-]+  # Nome do usuário
     * @                  # Símbolo @
     * [a-zA-Z0-9.-]+     # Domínio
     * \.                 # Ponto literal
     * [a-zA-Z]{2,}       # Top-level domain (com 2 ou mais letras)
     * $                  # Fim da linha
     */
    private static final String EMAIL_REGEX_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    // Compila a Regex para melhor performance
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);

    // Construtor privado para que a classe não possa ser instanciada.
    private ValidaEmail() {}

    /**
     * Método público e estático que valida o formato de um e-mail.
     * @param email A String do e-mail a ser validada.
     * @return {true} se o e-mail for válido, {false} caso contrário.
     */
    public static boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        // Usa o pattern compilado para verificar se o e-mail corresponde à Regex
        return pattern.matcher(email).matches();
    }
}