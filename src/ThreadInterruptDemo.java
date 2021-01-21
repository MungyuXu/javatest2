
 class MyThread implements  Runnable {

    @Override
    public void run() {
        System.out.println("1.进入线程方法");
        try {
            Thread.sleep(3000);
            System.out.println("线程休眠3秒");
            System.out.println("2.完成休眠");

        }catch (Exception e){
            System.out.println("3.休眠终止");
            return;//返回调用处
        }
        System.out.println("4.run方法正常结束");
    }
}

public  class ThreadInterruptDemo{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread,"自定义线程");
        thread.start();
        try {
            Thread.sleep(2000);
            System.out.println("线程休眠2秒");
        }catch (Exception e){
            System.out.println("休眠被终止");
        }
        thread.interrupt();
        System.out.println("线程中断执行");
    }
}
