public class Animal {
    String name;
    String favFood;
    static int population;

    public Animal(String name, String food){
        this.name = name;
        this.favFood = food;
        population++;
    }

    public void sleep(){
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favFood)){
            System.out.println("YUM!! " + name +" wants more " + food);
        }else{
            this.sleep();
        }
    }
}
