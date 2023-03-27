package school;
import java.util.InputMismatchException;
import java.util.Scanner;
public class teacher {
    teacher(String _name,String _surname,String _patronymic,String[] _class1) {
        functions(_name,_surname,_patronymic,_class1);
    }
    private void functions(String name, String surname, String patronymic, String[] class1) {
        System.out.println("Ваше имя: " + name + "\nВаша фамилия: " + surname + "\nВаше отчество: " + patronymic + "\nВаши классы: ");
        for (int i = 0; i < class1.length; i++) {
            System.out.println(class1[i]);
        }
        System.out.println("Всё верно? Если да-вводите true,если нет-вводите false.");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        try {
        boolean check = sc.nextBoolean();
            if (check) {
                System.out.println("Вы записаны в систему как " + name + " " + surname + " " + patronymic + ".\n"+
                        "Ваши классы: ");
                for(int h=0;h<class1.length;h++){
                    System.out.println(class1[h]);
                }
            } else {
                return;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Вы что-то не то ввели, программа завершает своё выполнение, запустите её заново и вводите данные корректно. ");
            return;
        }
    }
}