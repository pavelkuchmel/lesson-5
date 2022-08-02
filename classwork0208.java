import java.util.Scanner;
public class classwork0208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
--------Lesson 5-Classwork-----------------------------------------------------------------------------------
         */
        //Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
        //недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
        /*
        System.out.print("Введите число (1-7): ");
        int num = in.nextInt();
        if (num==1) System.out.println("Понедельник");
        else if (num==2) System.out.println("Вторник");
        else if (num==3) System.out.println("Среда");
        else if (num==4) System.out.println("Четверг");
        else if (num==5) System.out.println("Пятница");
        else if (num==6) System.out.println("Суббота");
        else if (num==7) System.out.println("Воскресенье");
        else System.out.println("Введено неверное число");
         */
        /*
        System.out.print("Введите число (1-7): ");
        int num = in.nextInt();
        switch (num){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введено неверное значение");
         */
        /*
------------------------------------------------------------------------------------------------
         */
        //Case2. Дано целое число K.
        //Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно»,
        //3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне 1–5,
        //то вывести строку «ошибка».
        /*
------------------------------------------------------------------------------------------------
         */
        //For1. Даны целые числа K и N (N > 0). Вывести N раз число K.
        /*
        System.out.println("Введите два числа К и N: ");
        System.out.print("К = ");
        int k = in.nextInt();
        System.out.print("N = ");
        int n = in.nextInt();
        for (int i = 0;i<n;i++){
            System.out.println(k);
        }
        */
        /*
-------------------------------------------------------------------------------------------------
         */
        //For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа,
        //расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
        /*
        System.out.println("Введите два числа A и B: ");
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        int result = 0;
        for (int i=a;i<=b;a++){
            result +=1;
            System.out.println(i);
        }
        System.out.println(result);
        */
        /*
------------------------------------------------------------------------------------------------
         */
        //For3. Даны два целых числа A и B (A < B).
        //Вывести в порядке убывания все целые числа,
        //расположенные между A и B (не включая числа A и B), а также количество N этих чисел.
        /*
        System.out.println("Введите два числа A и B: ");
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        int result = 0;
        for (int i = b-1;i>a;i--){
            System.out.println(b);
            result+=1;
        }
        System.out.println("\n"+result);
         */
        /*
------------------------------------------------------------------------------------------------
         */
        //For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, ..., 10 кг конфет.
        /*
        System.out.println("Введите стоймость 1кг конфет: ");
        int price = in.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println("1 кг конфет будет стоить "+(price*i)+" USD");
        }
         */
        /*
-------------------------------------------------------------------------------------------------
         */
        //For5. Дано вещественное число — цена 1 кг конфет.
        //Вывести стоимость 0.1, 0.2, . .., 1 кг конфет.
        System.out.println("Введите стоймость 1кг конфет: ");
        int price1 = in.nextInt();
        double price = price1/(double)10;
        for (int i=1;i<=10;i++){
            System.out.println(price*i);
            System.out.println(Math.round(i*10)/10.0);
        }

    }
}
