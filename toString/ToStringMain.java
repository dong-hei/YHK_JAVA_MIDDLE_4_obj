package lang.obj.toString;

public class ToStringMain {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = obj.toString();

        //toString() 반환값 출력
        System.out.println(str);

        //obj 직접 출력
        System.out.println(obj);
    }
}
