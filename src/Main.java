public class Main {

    public static void main(String[] args) {

        String Huawei;
        Product product1 = new Product(5400,"Huawei");


        PrivateProduct privateProduct1= new PrivateProduct();
        String des = privateProduct1.getDescription();
        System.out.println(des);


        // tek constructor adlı yapıcı metot ile birden farklı işlemi
        //yapabilme durumuna "overloading" denir


        Constructor constructor1= new Constructor();

        Constructor constructor2= new Constructor(6,7);

       Constructor constructor = new Constructor(2,4,5);






    }
}
