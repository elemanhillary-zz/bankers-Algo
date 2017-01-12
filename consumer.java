class consumer implements Runnable{
factory fact;

consumer(factory fact){
this.fact = fact;
new Thread(this,"Consumer Thread").start();
}
public void run(){
while(true){
fact.get();
}
}
