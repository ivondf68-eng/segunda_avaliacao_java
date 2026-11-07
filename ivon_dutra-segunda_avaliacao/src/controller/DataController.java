package controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataController {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochMilli(1723470921421L);
        LocalDateTime dataHoraFormatada = LocalDateTime.ofInstant(instant, ZoneId.of("UTC-3"));
        System.out.println("Data e hora UTC-3: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataHoraFormatada));

        dataHoraFormatada = LocalDateTime.ofInstant(instant, ZoneId.of("UTC-4"));
        System.out.println("Data e hora UTC-4: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataHoraFormatada));

        Instant inicio = Instant.now();
        LocalDateTime dataCriacao = LocalDateTime.ofInstant(inicio, ZoneId.of("UTC-0"));
        LocalDateTime dataExpiracao = LocalDateTime.ofInstant(inicio.plusSeconds(7200L), ZoneId.of("UTC-0"));
        System.out.println("Data de Criacao: " +dataCriacao);
        System.out.println("Data de Expiracao: " +dataExpiracao);
    }
}
