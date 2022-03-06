package br.com.compass.uol.pb2022.util;

import br.com.compass.uol.pb2022.exception.BaseException;
import br.com.compass.uol.pb2022.listEnum.ListRegion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Util {

    public static void verificationState(String region){
        Boolean condition = false;
        for (ListRegion result: ListRegion.values()) {
            if(result.getDescricao().equalsIgnoreCase(region)) {
                condition = true;
                break;
            }
        }
         messageException(condition);
    }

    public static void messageException(Boolean condition){
            if(!condition)
                throw new BaseException("Region invalidates. Only the regions listed are available for registration: " +
                        "Norte, Nordeste, Sul, Sudeste e Centro-Oeste.");
    }

    public static void yearsCheck(LocalDate date, Long days){
        LocalDate now = LocalDate.now();

        Long diff = YEARS.between(date, now);

        if(!diff.equals(days)){
            throw new BaseException("Number of days does not correspond to the year of foundation.");
        }
    }
}
