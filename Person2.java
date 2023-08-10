public class Person2 implements MyObserver{

    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((Subject)o).getScore());
    }
    
}
