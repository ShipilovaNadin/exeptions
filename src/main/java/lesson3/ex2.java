package lesson3;

public class ex2 {
    // Создайте класс Счетчик, у которого есть метод add(), увеличивающий
    //значение внутренней int переменнойна 1.Сделайте так, чтобы с объектом
    //такого типа можно было работать в блоке try-with-resources. Нужно бросить
    //исключение, еслиработа с объектом типа счетчикбылане в ресурсном try
    //и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
    //лучше всего.
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add(1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static class Counter implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("СЧЕТЧИК ОТРАБОТАЛ");
        }

        public int add(int i) {
            i += 1;
            return i;
        }
    }
    //public static class Counter implements AutoCloseable {
//        private int count;
//        private boolean isClosed;
//
//        public Counter() {
//            this.count = 0;
//            this.isClosed = false;
//        }
//
//        public void add() {
//            if (isClosed) {
//                throw new IllegalStateException("Счетчик закрыт");
//            }
//            count++;
//        }
//    }
}
