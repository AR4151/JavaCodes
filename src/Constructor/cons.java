package Constructor;

//class con {
//    static void Main(){
//        System.out.println("This a method.");
//    }
//
//}
////If you wants call a method from another class without Creating an Object then that method must be Static.
//public class cons {
//    public static void main(String[] args) {
//        con.Main();
//
//    }
//}

class Point {
    int m_x, m_y;
    public Point(int x, int y) {    m_x = x;    m_y = y;
        System.out.println(m_x);
        System.out.println(m_y);}
    void Main(int a,int b){
        m_x=a;
        m_y=b;
    }
    public static void main(String [] args)
    {
        Point p = new Point(45,25);
        //p.m_x();
    }
}