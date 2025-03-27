package lang.obj.poly;

public class ObjPolyEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj){
//        obj,sound(); // 컴파일 오류, Obj는 sound()가 없다.
//        obj.move(); // 컴파일 오류, Obj는 move()가 없다.

        //객체에 맞는 다운 캐스팅 필요
        if (obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }
    }
}
