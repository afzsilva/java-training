package org.example.helpers.telefone;

public class Helper {

    public static String addMascaraTelefone(String numeroTelefoneSemDDD){
        //String telefoneMasked = "";
        if (numeroTelefoneSemDDD != null && numeroTelefoneSemDDD.matches("\\d{9}")){
          String  telefoneMasked = numeroTelefoneSemDDD.replaceAll("(\\d)(\\d{4})(\\d{4})","$1****-$3");
          return telefoneMasked;
        }
        return  numeroTelefoneSemDDD;
    }

    public static boolean matchesMask(String mask, String number) {
        if (mask == null || number == null) {
            return false;
        }

        // Remove formatação da máscara (hífens, pontos, etc.)
        String cleanMask = mask.replaceAll("[^\\d*]", "");

        // Verifica se tem apenas dígitos
        if (!number.matches("\\d+")) {
            return false;
        }

        if (cleanMask.length() != number.length()) {
            return false;
        }

        for (int i = 0; i < cleanMask.length(); i++) {
            char maskChar = cleanMask.charAt(i);
            char numberChar = number.charAt(i);

            if (maskChar != '*' && maskChar != numberChar) {
                return false;
            }
        }

        return true;
    }

    public static boolean matchesMaskComDDD(String mask, String number) {
        if (mask == null || number == null) {
            return false;
        }

        // Remove formatação da máscara (hífens, pontos, etc.)
        String cleanMask = mask.replaceAll("[^\\d*]", "");

        // Verifica se o número tem apenas dígitos
        if (!number.matches("\\d+")) {
            return false;
        }

        if (cleanMask.length() != number.length()) {
            return false;
        }

        for (int i = 0; i < cleanMask.length(); i++) {
            char maskChar = cleanMask.charAt(i);
            char numberChar = number.charAt(i);

            if (maskChar != '*' && maskChar != numberChar) {
                return false;
            }
        }

        return true;
    }
}