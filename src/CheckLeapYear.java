import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập vào năm kiểm tra: ");
        year = sc.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if(year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                    isLeapYear = true;
            }
        }
        if(isLeapYear) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không là năm nhuận");
        }
    }
}
