public class Main {
    public static void main(String[] args) {
        int sales[] = {2, 8, 6, -3, 0};
        SalesManager salesManager = new SalesManager(sales);// создание объекта
        System.out.println(salesManager.max());
    }
}