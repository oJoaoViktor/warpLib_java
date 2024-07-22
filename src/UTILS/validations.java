package UTILS;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import DAO.LivroDAO;
import DTO.LivroDTO;

public class validations {

    public static ClienteDTO alreadyExistsCpf(String cpf) {
        ClienteDAO objClienteDAO = new ClienteDAO();
        return objClienteDAO.clientAlreadyExists(cpf);
    }

    public static LivroDTO alreadyExistsISBN(String isbn) {
        LivroDAO objLivroDAO = new LivroDAO();
        return objLivroDAO.bookAlreadyExists(isbn);
    }

    public static boolean isValidCpf(String cpf) {
        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos são iguais
        char firstChar = cpf.charAt(0); // A variável é agora efetivamente final
        boolean allMatch = cpf.chars().allMatch(ch -> ch == firstChar);
        if (allMatch) {
            return false;
        }

        // Calcular e validar o primeiro dígito verificador
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int digito1 = 11 - (soma1 % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        // Calcular e validar o segundo dígito verificador
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int digito2 = 11 - (soma2 % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }
        return digito2 == Character.getNumericValue(cpf.charAt(10));
    }

    public static boolean isValidEmail(String email) {
        String[] domíniosPermitidos = {"@gmail.com", "@hotmail.com", "@yahoo.com", "@outlook.com", "@live.com", "@aol.com"};
        for (String domínio : domíniosPermitidos) {
            if (email.toLowerCase().endsWith(domínio)) {
                return true;
            }
        }
        return false;
    }
}
