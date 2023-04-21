package lesson2.homework2;
// Дан следующий код, исправьте его там, где требуется
//  public static void main(String[] args) throws Exception {
//            try {
//                int a = 90;
//                int b = 3;
//                System.out.println(a / b);
//                printSum(23, 234);
//                int[] abc = { 1, 2 };
//                abc[3] = 9;
//            } catch (Throwable ex) {
//                System.out.println("Что-то пошло не так...");
//            } catch (NullPointerException ex) {
//                System.out.println("Указатель не может указывать на null!");
//            } catch (IndexOutOfBoundsException ex) {
//                System.out.println("Массив выходит за пределы своего размера!");
//            }
//        }
//        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//            System.out.println(a + b);
//        }

public class task3 {

    public static void main(String[] args) { // throws Exception - пришлось это убрать (интуитивно ,
        // не понятно вообще когда это должо быть в самом названии метода. Никогда с таким не сталкивалась
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum (23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            System.out.println(ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
            System.out.println(ex.getMessage());
        }
    }
    public static void printSum (Integer a, Integer b) { //throws FileNotFoundException - аналогично убрала,
        // но остался вопрос а вообще это может быть в названии метода в принципе, если да - то когда,  или это всегда ошибка
        System.out.println(a + b);
    }
}
