public class Que4 {
    public int number;
    public Que4() {
    }
    public  void display(){
        int a= 1;
        while (a<=10){
              int square=a*a;
            System.out.println(" Square of first 10 number======"+square);
            a++;

        }
    }

    public static void main(String[] args) {
        Que4 obj = new Que4();
        obj.display();
    }

}
