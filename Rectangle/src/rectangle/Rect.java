//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package rectangle;
class Rect {
    int x, y, length, width;

    public Rect(int x, int y, int length, int width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public int getArea() {
        return length * width;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void changeSize(int n) {
        this.length = n;
        this.width = n;
    }

    public void print() {
        System.out.println("Rectangle: ");
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
