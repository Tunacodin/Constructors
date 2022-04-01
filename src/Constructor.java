public class Constructor {



    //Her class kendine ait constructor bulundurur.
    //Bir constructor oluşturmak için " Public _contructor() {}" yapmak yeterlidir

    public Constructor(){

System.out.println("Parametresiz yapıcı metot çalıştı..");

    }

    public Constructor(int x, int y){

    System.out.println("Parametreli metot çalıştı ve şu değeri getirdi :"+ (x+y));
    }




     public Constructor(int a, int b, int c) {

System.out.println("3 parametreli yapıcı metot getirdi:"+ a*b*c);
        }
    }

