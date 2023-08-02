//class Abstract
//Inheritance
//Encapsulation
//Overriding
//Overloading

abstract class peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends peminjaman{
    @Override
    void denda(){

    }
}

class Parent{
    public int x;

    void print(String tipeAnggota, int bayar){
        System.out.println("Print z");
    }

    void print(String tipeAnggota){
        System.out.println("Print z");
    }

    void print(){
        System.out.println("Print 2");
    }
}

class A extends Parent{

    @Override
    void print(){
System.out.println("Print A");
    }

    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class App extends Parent{

public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("mahasiswa");

        A a = new A();
        a.print();

        
    }
}