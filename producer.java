class producer{
factory fact;

producer(factory fact){
this.fact = fact;
new Thread(this,"Producer Thread").start();
}

public void run(){
int i = 0;
while(true){
fact.put(i++);
}
}
