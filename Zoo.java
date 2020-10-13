public class Zoo{

  public static void main(String[] args){
    Animal sparrow1 = new Sparrow(1, "M", 4);
    //sparrow1.move();
    
    Animal fish1 = new Fish(1,"M",2);
    //fish1.move();
    
    moveAnimals(fish1);//polymorphism
    
    moveAnimals(sparrow1);//polymorphism
    
  }

public static void moveAnimals(Animal animal){
    animal.move();
}

}
