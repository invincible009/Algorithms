package com.sdl.localClasseExample;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalClassesExample {

    public static String regularExpression ="[^0-9]";


    public boolean isValidPhoneNumber(String phoneNumber1){
        final int numberLength = 11;

        class PhoneNumber{
            String formattedPhoneNumber;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression, " ");
                if(currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }
            public String getNumber(){
                return formattedPhoneNumber;
            }
        }
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);

        if(myNumber1.getNumber() == null)
           return false;
        else
          return true;


    }

    public LocalDate dateOfBirth(){
        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusMonths(10);
        return payday;
    }

    public LocalDate aYearFromToday(int nextBirthDay){
        //There has to be a way of converting the string year to the expected format
        LocalDate today = LocalDate.of(1990, Month.JULY, 10);
        LocalDate nextYear = today.plusYears(nextBirthDay);
        return nextYear;
    }
}
