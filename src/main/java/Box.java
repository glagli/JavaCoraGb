public class Box <T extends Fruit>{
    private T obj;
    public String nameBox;

    public Box(T obj, String nameBox) {
        this.obj = obj;
        this.nameBox = nameBox;
    }

    public double getWeight(){
        return obj.count * obj.weight;
    }

    public void showWeight(){
        System.out.print("Вес фруктов в " + nameBox + "=" + obj.weight );
    }

    public boolean compare(Box<?> another){
        if (this.getWeight() == another.getWeight() ){
            System.out.print("Масса коробок одинаковая ");
            return true;
        }
        else {
            System.out.print("Масса коробок разная ");
            return false;
        }
    }

    public void addFruit(T fruit){
        obj.count = obj.count + fruit.count;
    }

    public int showCount(){
        System.out.print("Кол-во фруктов в " + nameBox + "= ");
        return obj.count;
    }

    public void pourOver(Box<T> another){
            another.obj.count = obj.count + another.obj.count;
            obj.count = 0;
    }

}
