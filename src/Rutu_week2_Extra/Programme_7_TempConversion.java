package Rutu_week2_Extra;

import java.util.Scanner;

public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Temperature in fahrenheit : ");
        float temp =scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t =new Programme_7_TempConversion();
          t.convertTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }

//Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){

    float c =((temp -32) *5/9);
        System.out.println("The temperature \" + temp + \" fahrenheit is equal to \" + c + \" degree celsius\"");


}
}