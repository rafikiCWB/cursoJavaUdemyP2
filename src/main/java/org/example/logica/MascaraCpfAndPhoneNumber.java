package org.example.logica;

/**
 * The MascaraCpf class is responsible for validating and formatting a CPF number.
 */
public class MascaraCpfAndPhoneNumber {
    public static void main(String[] args) {

        String numberCpf = "12345678900";
        String resultCpfFormat = formatCpf(numberCpf);
        System.out.println(resultCpfFormat);


        String numberPhone = "5541998366391";
        String resultPhoneFormat = formatNumberPhone(numberPhone);
        System.out.println(resultPhoneFormat);

    }

    // validar o cpf como xxx.xxx.xxx.xx
    public static String formatCpf(String cpf) {
        return addCpfPart(cpf, 0, 3) +
                addCpfPart(cpf, 3, 6) +
                addCpfPart(cpf, 6, 9) +
                cpf.substring(9);
//000.000.000.00
    }

    public static String addCpfPart(String cpf, int startIndex, int endIndex) {
        return cpf.substring(startIndex, endIndex) + ".";
    }

    public static String formatNumberPhone(String numberPhone) {
        // xx+(xx)x'xxxx-xxxx
        return "+" + numberPhone.substring(0, 2) +
                "(" + numberPhone.substring(2, 4) + ")" +
                numberPhone.charAt(4) + "'" +
                numberPhone.substring(5, 9) + "-" +
                numberPhone.substring(9, 13);

    }

}
