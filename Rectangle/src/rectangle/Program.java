package rectangle;
class Program {
    public static void main(String[] args) {
        // Testing Rect class
        Rect rect = new Rect(0, 0, 10, 5);
        if(rect.length>0 && rect.width>0){
            rect.print();
            rect.move(5, 5);
            rect.changeSize(7);
            rect.print();
        }
        // Testing Date class
        Date date1 = new Date(2024, 2, 25);
        Date date2 = new Date(2023, 12, 20);
        date1.print();
        date2.print();

        date1.addDays(10);
        date1.print();

        System.out.println("Days difference: " + date1.compare(date2));
    }
}
