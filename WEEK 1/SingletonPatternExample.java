class Logger{
    private static Logger i; 
    private Logger(){
        System.out.println("Logger class");
    }
    public static Logger getInst(){
        if(i==null){
        i=new Logger();
    }
    return i;
}
public void Log(String m){
    System.out.println("Log:"+m);
}}
public class SingletonPatternExample
{
	public static void main(String[] args) {
	    Logger l1=Logger.getInst();
	    l1.Log("Started");
	    Logger l2=Logger.getInst();
	    l2.Log("Proccessing");

	    System.out.println("Loggers same:"+(l1==l2)); 
	}
}