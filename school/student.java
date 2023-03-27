package school;
import java.util.InputMismatchException;
import java.util.Scanner;
public class student {
    student(String _name,String _surname,String _patronymic,int _class1,String _class2){
        functions(_name,_surname,_patronymic,_class1,_class2);
    }
    private void functions(String name,String surname,String patronymic,int class1,String class2){
        System.out.println("Ваше имя: "+name+"\nВаша фамилия: "+surname+"\nВаше отчество: "+patronymic+"\nВы учитесь в "+class1+" "+"'"+class2+"'"+" классе");
        System.out.println("Верно? вводите true-правда, false-неправда");
        Scanner sc=new Scanner(System.in);
        try {
            boolean check = sc.nextBoolean();
            if(check){
                System.out.println("Вы записаны в систему как "+name+" "+surname+" "+patronymic+".\nВы учитесь в "+class1+" "+class2+" классе.");
            }
            else{
                return;
            }
        }catch (InputMismatchException ex){
            System.out.println("Вы что-то не то ввели, программа завершает своё выполнение, запустите её заново и вводите данные корректно. ");
            return;
        }
    }
}
