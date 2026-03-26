package OOP_다운캐스팅;

import java.util.ArrayList;

/*
    Casting : 형 변환
    Parent o = new Child() -> Up Casting : 부모 클래스의 참조 변수가 자식 클래스를 바라보는 것
    Down Casting : Up Casting 된 객체를 다시 하위 클래스 타입으로 형 변환
*/
public class DownCastingMain {
    ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
//        Animal a = new Human();
//        a.move();     -> OK
//        a.readBook(); -> Error
/*
        Animal ani = new Animal();
        Human man = new Human();

        System.out.println(ani instanceof Animal);  // true
        System.out.println(man instanceof Human);   // true
        System.out.println(ani instanceof Human);   // false
        System.out.println(man instanceof Animal);  // true
*/
        DownCastingMain downCasting = new DownCastingMain();
        downCasting.addAnimal();
        downCasting.downCast();
    }
    public void addAnimal() {
        animals.add(new Animal());
        animals.add(new Human());
        animals.add(new Tiger());
        animals.add(new Eagle());
        for (Animal animal : animals) {
            animal.move();
        }
    }

    public void downCast() {
        for (Animal animal : animals) {
            if (animal instanceof Human h) { h.readBook(); }        // Human
            else if (animal instanceof Tiger t) { t.hunting(); }    // Tiger
            else if (animal instanceof Eagle e) { e.flying(); }     // Eagle
            else System.out.println("지원되지 않는 형 입니다.");       // Animal
        }
    }
}

class Animal {
    public void move() {
        System.out.println("M O V E !");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("H U M A N !  M O V E !!");
    }
    public void readBook() {
        System.out.println("사람이라면 책을 읽읍시다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("어흥! M O V E !!");
    }
    public void hunting() {
        System.out.println("크아앙");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("활공 M O V E !!");
    }
    public void flying() {
        System.out.println("날개를~ 활짝 펴고~! 세상을~ 자유롭게 날거야~");
    }
}