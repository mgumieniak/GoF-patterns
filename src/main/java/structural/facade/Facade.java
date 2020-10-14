package structural.facade;

class Facade {
    private final Class1 class1;
    private final Class2 class2;

    public Facade(Class1 class1, Class2 class2) {
        this.class1 = class1;
        this.class2 = class2;
    }

    public void addClient(){
        class1.execute();
    }

    public void changeClient(){
        class2.execute();
    }
}
