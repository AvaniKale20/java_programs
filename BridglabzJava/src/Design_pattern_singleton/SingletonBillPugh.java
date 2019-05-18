package Design_pattern_singleton;

public class SingletonBillPugh {

    private SingletonBillPugh()
    {
    	
    }
    //HERE WE USE STATIC INNER HELPER CLASS
    //IT IS NOT LOADED UNTIL GETiNSTANCE MRTHOD CALLED
    private static class SingletonHelper{
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }
    
    public static SingletonBillPugh getInstance(){
        return SingletonHelper.instance;
    }
}
