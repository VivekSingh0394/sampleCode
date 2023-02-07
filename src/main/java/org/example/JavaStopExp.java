package org.example;
//class Hello
//{
//        // Declare an instance block.
//        {
//                show();
//        }
//        Hello()
//        {
//                System.out.println("Hello constructor");
//                show();
//        }
//        void show()
//        {
//                System.out.println("Hello method");
//        }
//}
//class Hi extends Hello
//{
//        Hi()
//        {
//                System.out.println("Hi constructor");
//        }
//        void show()
//        { // Override the show() method.
//                System.out.println("Hi method");
//        }
//}
//class TestHelloHi extends Hi
//{
//        public static void main(String[] args)
//        {
//                Hi obj = new Hi();
//                obj.show(); // show() method of Hi class is called.
//
//// Superclass reference is equal to child class object.
//                Hello obj1 = new Hi();
//                obj1.show();
//        }
//}
class Sum
{
        public void add(int x)
        {
                System.out.println(x+x);
        }
        public void add(int... x)
        {
                // We can call this method by passing any int value including zero.
                System.out.println(x);
        }
        public static void main(String[] args)
        {
                Sum s = new Sum();
                s.add(0); // Exact matched.
                s.add(10); // Exact matched.
        }
}
//class P
//{
//        // Declare an instance variable.
//        int a = 30;
//}
// class Q extends P
//{
//        // Declare an instance variable whose name is same as that of the superclass instance variable name.
//        int a = 50;
//}
// class Test extends Q {
//        public static void main(String[] args)
//        {
//// Create an object of class Q and call the instance variable using reference variable q.
//                Q q = new Q();
//                System.out.println(" Value of a: " +q.a); // 'a' of Q is called
//                // Declare superclass reference is equal to the child class object.
//                P p = new Q();
//                System.out.println("Value of a: " +p.a); // 'a' of P is called.
//        }
//}

//class Baseclass
//{
//        int x = 20;
//        // Overridden method.
//        void msg()
//        {
//                System.out.println("Base class method");
//        }
//}
//class Childclass extends Baseclass
//{
//        int x = 50;
//        int y = 100;
//        // Overriding method.
//        void msg()
//        {
//                System.out.println("Child class first method");
//        }
//        void msg2()
//        {
//                System.out.println("Child class second method");
//        }
//}
//class MyTest extends Childclass {
//        public static void main(String[] args)
//        {
//                Childclass obj = new Childclass();
//                System.out.println("Value of x: " +obj.x); // x of class Childclass is called.
//                obj.msg(); // msg() of Childclass is called.
//                obj.msg2(); // msg2() of Childclass is called.
//
//                Baseclass obj2 = new Childclass();
//                System.out.println("Value of x: " +obj2.x); // x of Baseclass is called.
//
//// System.out.println("Value of y: " +obj2.y); // Error because y does not exist in Baseclass.
//                obj2.msg(); // msg() of Childclass is called.
//                // obj2.msg2(); // Error because the method msg2() does not exist in Baseclass.
//        }
//}






//class TypePro
//{
//        public void m1(String s)
//        {
//                System.out.println("Hello");
//        }
//        public void m1(StringBuffer s)
//        {
//                System.out.println("Java");
//        }
//        public static void main(String[] args)
//        {
//                TypePro t = new TypePro();
//// t.m1(new Object() ); // Exact match not found because The method m1(String) is not applicable with object argument.
//                t.m1("Deep"); // Exact match with string argument.
//                t.m1(new StringBuffer()); // Exact match with string buffer parameter.
// //t.m1(null); // The method m1(String) is ambiguous for the type TypePro.
//        }
//}
//class TypePro
//        {
//public void m1(String s)
//        {
//        System.out.println("Hello");
//        }
//public void m1(Object o)
//        {
//        System.out.println("Java");
//        }
//public static void main(String[] args)
//        {
//        TypePro t = new TypePro();
//        t.m1(new Object()); // Exact match with object argument.
//                t.m1("Deep"); // Exact match with string argument.
//                t.m1(10);
//                t.m1(10.5f);
//                t.m1('a');
//                t.m1(null);
//        }
//        }
//class TypePro {
//        public void m1(int i) {
//                System.out.println("Hello");
//        }
//
//        public void m1(float f) {
//                System.out.println("Java");
//        }
//
//        public static void main(String[] args) {
//                TypePro t = new TypePro();
//                t.m1(10);
//                t.m1(10.5f);
//                t.m1('a');
//                t.m1(10l);
//               //  t.m1(10.5); // Compile time error.
//        }
//}

//class TypePro
//{
//        public void m1(byte a)
//        {
//                System.out.println(a+a);
//        }
//        public void m1(short a)
//        {
//                System.out.println(a+a);
//        }
//        public static void main(String[] args)
//        {
//                TypePro t = new TypePro();
//                t.m1(10); // Exact match is not found because the method m1(byte) is not applicable for the argument (int).
//        }
//}
//class TypePro
//{
//        public void m1(double a)
//        {
//                System.out.println("high "+(a+a));
//        }
//        public void m1(short a)
//        {
//                System.out.println(a+a);
//        }
//        public static void main(String[] args)
//        {
//                TypePro t = new TypePro();
//                t.m1(2); // Exact match is not found for passing argument 2 because 2 is an integer data type.
//        }
//}

//class TypePro
//{
//        public void m1(double a)
//        {
//                System.out.println("yes"+a*a);
//        }
//        public void m1(float a)
//        {
//                System.out.println("no "+a*a);
//        }
//        public static void main(String[] args)
//        {
//                TypePro t = new TypePro();
//                t.m1(2); // Exact match is not found for passing argument 2 because 2 is an integer data type.
//        }
//}
