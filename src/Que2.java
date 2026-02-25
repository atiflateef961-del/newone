public class Que2 {
     public  int number;

    public Que2() {
    }
    public  void display(){
        int t=1;
        int sum=0;
        while (t<=10){
             sum=sum+t;

            System.out.println(" First 10 number======"+t);
            t++;
        }
        System.out.println(" Sum of first 10 number================="+sum);
    }

    public static void main(String[] args) {
        Que2 obj = new Que2();
        obj.display();
    }
}
