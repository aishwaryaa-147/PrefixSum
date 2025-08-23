//main of childThread
class main
{
public static void main(String args[])
{
childThread o=new childThread();
try
{
for(int i=0;i<5;i++)
{
System.out.println("In main"+i);
Thread.sleep(3000);
}
}
catch(InterruptedException e)
{
System.out.println("caught interrupt");
}
}
}
