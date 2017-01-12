class bankers{
public static void main(String[] args){
  factory fact = new factory();
  new producer(fact);
  new consumer(fact);
}
}
