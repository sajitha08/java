interface Animaleat {
void eat();
}
interface Animaltravel {
void travel();
}
class Animal implements Animaleat, Animaltravel {
public void eat() {
System.out.println("Animal is Eating");
}
public void travel() {
System.out.println("Animal is Travelling");
}
}
public class Program2{
public static void main(String args[]) {
Animal a = new Animal();
a.eat();
a.travel();
}
}