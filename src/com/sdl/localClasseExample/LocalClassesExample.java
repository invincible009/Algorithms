package com.sdl.localClasseExample;


import java.util.ArrayList;

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
}
