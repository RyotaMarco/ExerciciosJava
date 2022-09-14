package Aplication;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ConvertendoDataHoraEmTexto {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm" );
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println(fmt1.format(d04));
        System.out.println(d05.format(fmt2));
        System.out.println(fmt3.format(d06));

        //for (String s: ZoneId.getAvailabeZoneIds()); Usado para saber os time zones disponiveis//
        //Syste.out.println(s);

        Instant d07 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d07,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d07,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d07,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d07,ZoneId.of("Portugal"));

        System.out.println("R1==" + r1);
        System.out.println("R2==" + r2);
        System.out.println("R3==" + r3);
        System.out.println("R4==" + r4);
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());

        //Calculos com data-hora//

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);

        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("next Week = " + nextWeek);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("PastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("next WeekDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("PastWeekInstant = " + pastWeekInstant);
        System.out.println("next Week Instant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d04);
        System.out.println("t1 dias = " + t1.toDays());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());

    }
    }
