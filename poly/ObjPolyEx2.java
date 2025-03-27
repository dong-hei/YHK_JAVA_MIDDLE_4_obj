package lang.obj.poly;

public class ObjPolyEx2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();

        Object[] objArr = {dog, car , obj};

        //Obj 타입만 사용하는 배열에 담긴 객체 수를 세는 역할
        size(objArr);
    }

    private static void size(Object[] objArr) {
        System.out.println("전달된 객체 수는? : " + objArr.length);
    }
}
