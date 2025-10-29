import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        #1.1           //
   /* String srt1 = "some 22 of them 36 are 5 numbers -8";
    Scanner sc = new Scanner(srt1);
    int i =0;
    for(;sc.hasNext();){
        if(sc.hasNextInt()){
            System.out.println(sc.nextInt()+" was found");
            i++;
    }else{
            sc.next();
        }
    }
    System.out.println(i+" numbers was found");*/


        //#1.2///
       /* Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.print("enter a binary code to convert to an integer : ");
            if (sc.hasNextInt(2)) {
                System.out.println("a binary converted to an integer has a value " + sc.nextInt(2));
                break;
            } else {
                sc.next();
                System.out.println("entered value isn`t a binary");
            }
        }

        // --- hexadecimal ---
        for(;;) {
            System.out.print("enter a hexadecimal code to convert to an integer : ");
            if (sc.hasNextInt(16)) {
                System.out.println("hexadecimal converted to an integer has a value " + sc.nextInt(16));
                break;
            } else {
                sc.next();
                System.out.println("entered value isn`t a hexadecimal");
            }
        }*/


        //2.1//
/*
        Scanner sc = new Scanner(System.in);
        double[] ints= new double[1000];
        int count =0;
        for (;;) {
            String input = sc.nextLine();
            if (input.equals("break")) {
                break;
            }
            try {
                double val = Double.parseDouble(input);
                ints[count] = val;
                count++;
            } catch (NumberFormatException e) {}
        }
        for(var in:ints){
            double d = in;
            if(d>=0){
                System.out.println("+"+d);
            }else{
                System.out.println(d);
            }
        }*/

        //2.2//
        /*String[] code = {
                "AUD", "GBP", "BYR", "DKK", "USD", "EUR", "KZT"
        };
        int[] unit = {
                1, 1, 10000, 10, 1, 1, 100
        };
        String[] currency = {
                "Австралійський долар",
                "Фунт стерлінгів",
                "Білоруський рубль",
                "Датська крона",
                "Долар США",
                "Євро",
                "Казахський тенге"
        };
        double[] equivalent = {
                23.9883, 45.8429, 19.7716, 25.9192, 27.4643, 31.3695, 15.4654
        };
        System.out.printf("%-5s %-10s %-25s %s%n", "Код", "За одиницю", "Валюта", "UAH");
        for (int i = 0; i < code.length; i++) {
            System.out.printf("%-5s %-10d %-25s %.4f%n", code[i], unit[i], currency[i], equivalent[i]);
        }*/
        //2.3//
        /*Scanner sc = new Scanner(System.in);
        String[] Str= new String[1000];
        int count =0;
        for (int i=0;;i++) {
            String input = sc.nextLine();
            if (input.equals("break")) {
                break;
            }
            Str[i]=input;
        }
        for(var str:Str){
            if(str==null) continue;
            if(str.isEmpty()||str.isBlank()) {
                count++;
            }
        }
        System.out.println("Number of Blank "+count);*/


        // 3 // через printf
        /*String[] strs = new String[1000];
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean strDigit=false,strUper=false,strLower=false,strSpesial=false,strLangth=false;
        for(int i =0 ;;i++){
            String input=sc.nextLine();
            if(input.equals("break")){
                break;
            }
            strs[i]=input;
        }
        for(var st : strs){
            if(st==null) continue;
            int langth=0;
            for(char c:st.toCharArray()){
                if(Character.isDigit(c)) strDigit=true;
                if(Character.isLowerCase(c)) strLower=true;
                if(Character.isUpperCase(c)) strUper=true;
                if(c=='!'||c=='#'||c=='$'||c=='%') strSpesial=true;
                langth++;
                if(langth>=8)strLangth=true;
            }
            if(strLangth&&strDigit&&strSpesial&&strLower&&strUper){
                list.add(st);
            }
            strDigit=false;
            strLower=false;
            strUper=false;
            strSpesial=false;
            strLangth=false;
        }
        System.out.printf("Валідні:%n"+Arrays.toString(list.toArray())+"%n Не валідні:%n");
        for(var st:strs){
            if(st==null) continue;
            boolean continuePoint=false;
            for(var notSt:list.toArray()){
                if(st.equals(notSt)){
                    continuePoint=true;
                    break;
                }
            }
            if(continuePoint)continue;
            System.out.println(st);
        }*/

        //3//через регулярку

       /* Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!#%$]).{8,}$");
        String[] strs = new String[1000];
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;;i++){
            String input=sc.nextLine();
            if(input.equals("break")){
                break;
            }
            strs[i]=input;
        }
        System.out.println("Валідні:");
        for(var st : strs){
            if(st==null) continue;
            if(pattern.matcher(st).matches()){
                System.out.println(st);
            }
        }
        System.out.println("Не Валідні:");
        for(var st : strs){
            if(st==null) continue;
            if(!pattern.matcher(st).matches()){
                System.out.println(st);
            }
        }*/



    }
}