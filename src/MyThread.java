public class MyThread extends Thread {
    String name;

    MyThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        int count = 0;
        while (count < 600) {
            System.out.println("Отправка письма от "+ name);
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("MyThread running" + MyThread.MIN_PRIORITY);
            count++;
        }
    }
}
