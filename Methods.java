public class Methods{
   
        public void add()
        {
            int a=10;
            int b =20;
            System.out.println("Addition "+(a+b));
        }

         public static void  sub()
        {
            int a=10;
            int b =20;
            System.out.println("Difference "+(a-b));
        }

         public void mul()
        {
            int a=10;
            int b =20;
            System.out.println("Product "+(a*b));
        }
    public static void main(String[] args)
    {
        Methods m = new Methods();
        m.add();
        m.sub();
        m.mul();
        Methods.sub();
    
    }
}