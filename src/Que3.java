import java.util.Scanner;

public class Que3 {
    public  int number;
    public  Que3(){};

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Que3(int number) {
        this.number = number;
    }
     public  void input(){
         Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            setNumber(scanner.nextInt());
     }

    public  void display(){
        int a=1;
        int sum=0;
        while (a<=getNumber()) {
            sum = sum + a;
            a++;
        }
            if (getNumber()%2!=0){
                System.out.println( " odd number ======"+getNumber());
            }else {
                System.out.println(" even number ======"+getNumber());
            }
            System.out.println("odd number sum ======"+sum);

            }






    public static void main(String[] args) {
        Que3 obj = new Que3();
        obj.input();
        obj.display();
    }
}
