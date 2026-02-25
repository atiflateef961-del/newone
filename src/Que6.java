import java .util.Scanner;
public class Que6 {
    public int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number ");
        setNumber(scanner.nextInt());
    }

    public void display() {
        int a=getNumber();
        int factorial=1;
        while (getNumber()>1);
        a= a*a;

        factorial++;


        System.out.println( " factorial ======"+factorial);
    }


    public static void main(String[] args) {
        Que6 obj = new Que6();
        obj.input();
        obj.display();
    }

}




