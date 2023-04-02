
          Thread t3 = new Thread(tg1, runnable,"three");    
          t3.start();    
                 
          System.out.println("Thread Group Name: "+tg1.getName());    
         tg1.list();    
    
    }    
   }