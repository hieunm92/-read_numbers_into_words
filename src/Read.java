import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong: ");
        int number = sc.nextInt();
        if (number >= 0 & number <10){
            System.out.println("So ban nhap la: "+ readNumber(number));
        }else if(number < 20){
            System.out.println("So ban nhap la: " + readNumbers(number));
        }else if(number < 100){
            int before = number /10;
            int after = number % 10;
            System.out.println("So ban nhap la: " + readNumber(before)+ "ty" +readNumber(after));
        }else if(number < 1000){
            int hundred = number / 100;
            int hundreds = number % 100;
            int before = hundreds / 10;
            int after = hundreds % 10;
            System.out.println("So ban nhap la: "+ readNumber(hundred)+" hundred "+ readNumbered(before)+ readNumber(after));
        }

    }
    public static String readNumber(int x){
        String read;
        switch (x){
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
            default:
                read="";
        }
        return read;

    }
    public static String readNumbers (int number){
        String read;
        switch (number){
            case 0:
                read = "ten";
                break;
            case 1:
                read = "eleven";
                break;
            case 2:
                read = "twelve";
                break;
            case 3:
                read = "thirteen";
                break;
            case 4:
                read = "fourteen";
                break;
            case 5:
                read = "fifteen";
                break;
            case 6:
                read = "sixteen";
                break;
            case 7:
                read = "seventeen";
                break;
            case 8:
                read = "eighteen";
                break;
            case 9:
                read = "nineteen";
            default:
                read = "";
        }
        return read;
    }
    public static String readNumbered (int number) {
        String read;
        switch (number) {

            case 20:
                read = "twenty";
                break;
            case 30:
                read = "thirty";
                break;
            case 40:
                read = "fourty";
                break;
            case 50:
                read = "fifty";
                break;
            case 60:
                read = "sixty";
                break;
            case 70:
                read = "seventy";
                break;
            case 80:
                read = "eighty";
                break;
            case 90:
                read = "ninety";
            default:
                read = "";
        }
        return read;
    }
}





