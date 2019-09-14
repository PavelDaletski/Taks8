public class Subscriber extends Thread {
    private String [] names;
    int a = (int) (Math.random()*(100+1)) + 1000;



    Subscriber(String... names){
        this.names=names;
    }

    public void run(){
        for (int i=0; i<names.length; i++){
            System.out.println("Обанент принят " + names[i]);
            try {
                sleep(a);
            }catch (Exception e) {}
        }
    }

}
