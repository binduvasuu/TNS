package oops.polymorphism;

//runtime polymorphism - method decl get binded to its def at runtime by java
//dynamic poly - once its binded it can be rebinded
//late binding - because its executing at runtime

    class Whatsapp{
        public void status(){
            System.out.println("Seeing status");
        }

        public void calls(){
            System.out.println("Make calls");
        }

        public void message(){
            System.out.println("Texting");
        }
    }


    class Whatsapp2 extends Whatsapp{
        public void status(){
            System.out.println("See Status and React");
        }
    }


        public class MethodOverriding { 
           public static void main(String[] args) {
            System.out.println("HI");
            Whatsapp wh = new Whatsapp();
            wh.status();
            wh.calls();
            wh.message();

            Whatsapp2 wh2 = new Whatsapp2();
            wh2.status();
        }
    }

