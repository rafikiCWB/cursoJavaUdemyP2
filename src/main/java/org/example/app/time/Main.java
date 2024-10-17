package org.example.app.time;

import java.text.NumberFormat;
import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        // Obtem a data atual
        LocalDate currentDate = LocalDate.now();
        out.println("Data atual: " + currentDate);

        //Obtem a data e hota atual
        var currentTime = LocalTime.now();
        out.println("Hora atual: " + currentTime);

        //Obtem a data e hora atual
        var currentDateTime = LocalDateTime.now();
        out.println("Data e hora atual: " + currentDateTime);

        // Formata a data e hora de acordo com o padrão especificado
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        out.println("Data e hora formatada: " + formattedDateTime);

        var formattedDateTimeStream = Stream.of(currentDateTime)
                .map(dt -> dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")))
                .findFirst()
                .orElse("");
        out.println("Data e hora formatada: " + formattedDateTimeStream);

        out.println("------------");

        LocalDate date = LocalDate.now();
        var datePlusDays = date.plusDays(5);
        out.println("Data atual + 5 dias: " + datePlusDays);

        // Adicionando ou subtraindo horas
        var time = LocalTime.now();
        LocalTime timeMinusHours = time.minusHours(2);
        out.println("Hora atual - 2 horas: " + timeMinusHours);

        // Calculando a diferença entre duas datas
        var startDate = LocalDate.of(2023, 1, 1);
        var endDate = LocalDate.of(2024, 2, 1);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        out.println("Dias entre " + startDate + " e " + endDate + ": " + daysBetween);

        // Obtendo a data e hora atual em um fuso horário específico
        var zoneId = ZoneId.of("America/Sao_Paulo");
        var zonedDateTime = ZonedDateTime.now(zoneId);
        out.println("Data e hora em São Paulo: " + zonedDateTime);

        //Asia/Kolkata
        var zoneId2 = ZoneId.of("Asia/Kolkata");
        var zonedDateTime2 = ZonedDateTime.now(zoneId2);
        out.println("Data e hora na Asia/Kolkata: " + zonedDateTime2);

        // Obtendo a data atual no calendário Tailandês
        var thaiBuddhistDate = ThaiBuddhistDate.now();
        out.println("Data atual no calendário Tailandês: " + thaiBuddhistDate);

        // Convertendo uma data ISO para o calendário Tailandês
        var isoDate = LocalDate.of(2023, 12, 25); // Data ISO
        var thaiDateFromIso = ThaiBuddhistDate.from(isoDate);
        out.println("Data ISO convertida para o calendário Tailandês: " + thaiDateFromIso);

        // Formatando uma data do calendário Tailandês
        var formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy G");
        String formattedThaiDate = thaiBuddhistDate.format(formatter2);
        out.println("Data Tailandesa formatada: " + formattedThaiDate);

        var thaiBuddhistDate1 = ThaiBuddhistDate.now();
        out.println("Data atual no calendário Tailandês: " + thaiBuddhistDate1);

        var isoDate1 = LocalDate.of(2023, 12, 25); // Data ISO
        ThaiBuddhistDate thaiDateFromIso1 = ThaiBuddhistDate.from(isoDate1);
        out.println("Data ISO convertida para o calendário Tailandês: " + thaiDateFromIso1);

        var formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy G");
        String formattedThaiDate1 = thaiBuddhistDate.format(formatter1);
        out.println("Data Tailandesa formatada: " + formattedThaiDate1);

        // Obtendo a data atual no calendário Japonês
        var calendarioJapones = JapaneseDate.now();
        out.println("Data atual no calendário Japonês: " + calendarioJapones);

        // Obtendo a data atual no calendário Hijri
        var calendarioHijri = HijrahDate.now();
        out.println("Data atual no calendário Hijri: " + calendarioHijri);

        out.println("Se o audio mono estiver ativado você desativa se estiver desativado você ativa");

        double price = 1000000;
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        out.println(moeda.format(price));

    }
}
