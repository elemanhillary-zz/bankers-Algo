class factory{
int n;
boolean valueSet = false;

synchronized void int get(){
while(!valueSet)
try{
wait();
}catch(interruptedException e){
}
valueSet = false;
System.out.println("Consumer got: "+n);
notify();
}
synchronized void put(int n){
while(valueSet);
try{
wait();
}catch(interruptedException e){
}
this.n=n;
System.out.println("Producer put: "+n);
valueSet = true;
notify();
}
}
