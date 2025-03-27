package lang.obj;

public class ObjectMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
        c.parentMethod();

        //toString()은 Obj 클래스의 메소드 (객체에 대한 정보 반환)
        String str = c.toString();
        System.out.println(str);
    }
}
