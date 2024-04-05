package com.epam.demo;

import java.util.List;
import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       for (String s:args){
           try{
           if (!isPositiveNumber(s)){
                return false;
           }
              }catch (NumberFormatException e){
                return false;
              }
       }
         return true;
    }
}