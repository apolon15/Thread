public class Main {

    public static void main(String[] args) {

        Mass thread1=new Mass(10);
        thread1.setName("GENERATE");


        thread1.start();
        try {
            thread1.join();
            System.out.println(thread1.getMass().length);
            Mass thread2=new Mass();
            thread2.setName("SUM");
            thread2.start();
            Mass thread3=new Mass();
            thread3.setName("AVG");
            thread3.start();





        } catch (InterruptedException e) {
            e.printStackTrace();
        }











        //        MyThread myThread2 = new MyThread("Катя");
//        //       myThread1.setDaemon(true);
//        myThread2.setPriority(Thread.MIN_PRIORITY);
//        myThread2.start();
//        for (int i = 0; i < 60; i++) {
//            System.out.println("Start Main ");
//        }
//        MyThreadRunnable thread3 = new MyThreadRunnable();
//        Thread threadRunnable = new Thread(thread3);
//        threadRunnable.start();
//        try {
//            myThread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if (!myThread2.isAlive()) {
//            System.out.println("Поток завис");
//        }

    }
}
