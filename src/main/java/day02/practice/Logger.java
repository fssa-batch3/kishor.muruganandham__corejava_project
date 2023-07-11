package day02.practice;

public class Logger {
    
    public static void debug(String msg) {
        System.out.println("DEBUG: " + msg);
    }
    
    public static void info(String msg) {
    	System.out.println("Info: " + msg);
    }

    public static void info(int num) {
    	System.out.println("Info: " + num);
    }
    
    public static void error(String msg) {
    	System.out.println("Error: " + msg);
    }
    
    public static void error(int num) {
    	System.out.println("Error: " + num);
    }
    
    public static void debug(int num) {
        System.out.println("Debug: " + num);
    }
    
    
    public static void main(String[] args) {
        Logger.debug("Debug message"); 
        Logger.debug(55);             
        Logger.info("Info message");   
        Logger.info(66);   
        Logger.error("Error message"); 
        Logger.error(77); 
    }
}

