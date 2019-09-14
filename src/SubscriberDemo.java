 /* Создать  коллцентр с 4 операторами.
 Что получилось то и сделал :(  я понимаю что это навреное всё не правильно, но пытался сделать */



public class SubscriberDemo {
    public static void main(String[] args) {

        String myArray[]={"Иван", "Паша", "Леша", "Алексей", "Сергей", "Андрей", "Настя", "Марина", "Денис", "Катя", "Алла", "Егор", "Толик", "Александр", "Марьян", "Алексей",
                "Владимр", "Валера", "Миша", "Андрей", "Даша","Кирил", "Евгений", "Артём", "Димитрий", "Света", "Марина", "Миша"};

        Subscriber queue1 = new Subscriber(myArray);
       // Subscriber queue2 = new Subscriber(myArray);
       // Subscriber queue3 = new Subscriber(myArray);
      //  Subscriber queue4 = new Subscriber(myArray);

        System.out.println("Начали!");
        queue1.start();
      //  queue2.start();
      //  queue3.start();
      //  queue4.start();


        try {
            System.out.println("Ожидание завершения потока");
            queue1.join();
          //  queue2.join();
        //    queue3.join();
        //    queue4.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Поток Один запущен: " + queue1.isAlive());
      //  System.out.println("Поток Два запущен: " + queue2.isAlive());
      //  System.out.println("Поток Три запущен: " + queue3.isAlive());
      //  System.out.println("Поток Четыри запущен: " + queue4.isAlive());


        System.out.println("Работа колл центра завершина");

    }

    }

