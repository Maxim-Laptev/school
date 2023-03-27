package school;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;
public class programm {
    public static void main(String[] args) throws SocketException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Кем вы хотите записаться?(пишите строчными буквами, учитель вы или ученик)");
        String message=sc.nextLine();
        try{
        switch (message){
            case "ученик":
                System.out.println("Введите ваше имя: ");
                String name1=sc.nextLine();
                System.out.println("Введите вашу фамилию: ");
                String surname1=sc.nextLine();
                System.out.println("Введите ваше отчество: ");
                String patronymic1=sc.nextLine();
                System.out.println("В каком вы классе?(введите только цифру, букву мы запросим позже)");
                int class2 = sc.nextInt();
                System.out.println("Какая буква вашего класса? ");
                String class3=sc.nextLine();
                String class4=sc.nextLine();
                student students=new student(name1,surname1,patronymic1,class2,class4);
                break;
            case "учитель":
                System.out.println("Введите ваше имя: ");
                String name2=sc.nextLine();
                System.out.println("Введите вашу фамилию: ");
                String surname2=sc.nextLine();
                System.out.println("Введите ваше отчество: ");
                String patronymic2=sc.nextLine();
                //
                System.out.println("Введите ваши классы(их должно быть не более 4, вводите их " +
                        "букву через тире, например 6-А, 8-б, можно строчными или заглавными): ");
                String[] class5=new String[4];
                System.out.println("Введите ваш первый класс: ");
                String a=sc.nextLine();
                class5[0]=a;
                System.out.println("Введите ваш второй класс: ");
                String b=sc.nextLine();
                class5[1]=b;
                System.out.println("Введите ваш третий класс: ");
                String c=sc.nextLine();
                class5[2]=c;
                System.out.println("Введите ваш четвертый класс: ");
                String d=sc.nextLine();
                class5[3]=d;
                break;
            default:
                throw new SocketException();
        }
        }catch(SocketException ex){
            System.out.println("Сверху же было написано, что надо было вводить учителя или ученика СТРОЧНЫМИ БУКВАМИ");
        }
    }
}
