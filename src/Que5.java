import java.util.Scanner;

public class Que5 {
    private int number;
    public Que5() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Que5(int number) {
        this.number = number;
    }
    public  void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        setNumber(scanner.nextInt());
    }
     public  void display(){
        int a=1;
        while (a<=10) {
            System.out.println("table" +getNumber()+":"+getNumber()+"*"+a+"="+getNumber()*a);

            a++;

        }

     }

    public static void main(String[] args) {
        Que5 obj = new Que5();
        obj.input();
        obj.display();
    }
}
