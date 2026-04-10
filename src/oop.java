class car{
    String company;
    String color;
    int topSpeed;
    void drive(){
        System.out.println("the car is ready");
    }
    public void printColor(){
        System.out.println(this.company);
        System.out.println(this.color);
        System.out.print(this.topSpeed);

    }
}
public class oop{
    public static void main(String[] args){
        car c1 = new car();
        c1.company="Tesla";
        c1.color="Gray";
        c1.topSpeed=300;
        c1.drive();
        c1.printColor();
    }
}
