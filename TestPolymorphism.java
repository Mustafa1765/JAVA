
class Animal {
       void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
      void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
       void sound() {
        System.out.println("Cat meows");
    }
}

 public class TestPolymorphism {  
    public static void main(String[] args) {
               Animal animal1 = new Dog();
        animal1.sound();  
                Animal animal2 = new Cat();
        animal2.sound(); 
    }
}
