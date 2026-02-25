import java.util.Scanner;

public class Que7 {
    private  int number;
    public Que7() {};
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public  void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number ");
        setNumber(scanner.nextInt());
    }
    public  void  display (){
        int digit=0;
//        int total    =number/10;
        while (getNumber()>0){
       number   =number/10;
//            number= number%10;

            digit++;
        }

        System.out.println("first digit ======"+digit);

    }


    public static void main(String[] args) {
        Que7 obj = new Que7();
        obj.input();
        obj.display();
    }


}
