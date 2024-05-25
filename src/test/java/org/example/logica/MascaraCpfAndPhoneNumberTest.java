package org.example.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class MascaraCpfAndPhoneNumberTest {

    private final static Logger LOGGER = Logger.getLogger(MascaraCpfAndPhoneNumberTest.class.getName());

    @Test
    public void mascaraCpfTest() {
        String cpf = "10006223982";
        String expectedCpf = "100.062.239.82";

        String result = MascaraCpfAndPhoneNumber.formatCpf(cpf);

        LOGGER.info("CPF Result: " + result);

        Assertions.assertEquals(expectedCpf, result);
    }

    @Test
    public void mascaraPhoneNumberTest() {
        String phoneNumber = "5541998366391";
        String expectedPhoneNumber = "+55(41)9'9836-6391";

        String result = MascaraCpfAndPhoneNumber.formatNumberPhone(phoneNumber);

        LOGGER.info("Phone Number: " + result);

        Assertions.assertEquals(expectedPhoneNumber, result);
    }
}