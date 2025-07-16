package Network.Multithread;

// Source code is decompiled from a .class file using FernFlower decompiler.
public class MyThread extends Thread {
   public MyThread() {
   }

   public void run() {
      for(int var1 = 0; var1 <= 10; ++var1) {
         System.out.println(var1);

         try {
            Thread.sleep(2000L);
         } catch (Exception var3) {
         }
      }

   }

   public static void main(String[] var0) {
      MyThread var1 = new MyThread();
      MyThread var2 = new MyThread();
      var1.start();
      var2.start();
   }
}
