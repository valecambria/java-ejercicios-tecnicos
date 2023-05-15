package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {

        private void invertirTexto(String input){
        String[] texto = input.split("");
        StringBuilder result = new StringBuilder();
        for (int i = texto.length; i>0; i--){
            result.append(texto[i-1]);
        }
            System.out.println(result);
        //StringBuilder builder = new StringBuilder(input);
            //return builder.reverse().toString();
        }

        private void esCapicua(int num){
            String num1 = String.valueOf(num);
            String reverso = new StringBuilder(num1).reverse().toString();
            if (num1.equals(reverso)){
                System.out.println("El numero: " + num + " Es capicua");
            }else {
                System.out.println("El numero: " + num + " No es capicua");
            }
        }

        private void cuantosCaracteres(String texto){
            int i, length, counter[] = new int[256]; //256 es la cantidad maxima de charcode

            length = texto.length();

            for (i = 0; i < length; i++){
                counter[texto.charAt(i)]++;
            }
            for (i = 0; i < 256; i++){
                if (counter[i] != 0){
                    System.out.println((char)i + " : " + counter[i]);
                }
            }
        }

        private void caracteresRepetidos(String texto){
            int i, length, counter[] = new int[256]; //256 es la cantidad maxima de charcode

            length = texto.length();

            for (i = 0; i < length; i++){
                counter[texto.charAt(i)]++;
            }
            for (i = 0; i < 256; i++){
                if (counter[i] > 1){
                    System.out.println((char)i + " : " + counter[i]);
                }
            }
        }

        private void esMultiploDe2(int num){
            if(num % 2 == 0){
                System.out.println(num + " Es multiplo de 2");
            }else{
                System.out.println(num + " No es multiplo de 2");
            }
        }

        private void esBisiesto(int año){
            boolean bisiesto =  LocalDate.of(año,1,1).isLeapYear();
            System.out.println("El año " + año + " es bisiesto? :" + bisiesto);
        }

        private void randomOrderText(String text){
            String[] array = text.split("");
            List<String> list = Arrays.asList(array);
            Collections.shuffle(list);
            list.forEach(System.out::println);
        }

        private void noDuplicados(List<Integer> list){
            Set<Integer> set = new HashSet<>(list);
            set.forEach(System.out::println);
        }

        private void hayVocalPresente(String text){
            if(text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u")){
                System.out.println("La palabra tiene vocales presentes");
            }else {
                System.out.println("La palabra no tiene vocales");
            }
        }

        private void esPalindromo(String texto){
            String reverso = new StringBuilder(texto).reverse().toString();
            if (texto.equals(reverso)){
                System.out.println(texto + " Es palindromo");
            }else {
                System.out.println(texto + " No es palindromo");
            }

        }

    public static void main(String[] args) {
        Main main = new Main();
        //main.invertirTexto("Invertir Texto");
        //main.esCapicua(500);
        //main.cuantosCaracteres("Valentino");
        //main.caracteresRepetidos("calle");
        //main.esMultiploDe2(5);
        //main.esBisiesto(2024);
        //main.randomOrderText("Clavicula");
        //main.noDuplicados(Arrays.asList(1,2,2,3,5,2,4));
        //main.hayVocalPresente("hola");
        //main.esPalindromo("nolocasesacolon");
    }
}