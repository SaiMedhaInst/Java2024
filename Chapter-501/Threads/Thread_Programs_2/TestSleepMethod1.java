class TestSleepMethod1{    
     
    public static void main(String args[]){    
        try{

            Thread.sleep();
        }
        catch(Exception e){System.out.println(e);};

        System.out.println("execution of main thread.....");
    }    
   } 