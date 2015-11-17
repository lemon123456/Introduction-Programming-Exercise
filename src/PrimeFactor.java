public class PrimeFactor{

  public static void main(String args[]){
    primeFactor(15);
  }

  public static void primeFactor(int n){
    int prime = 2;
    while(prime <= n)
    {
      if(prime == n)
      {
        System.out.print(n);
        return;
      }
      else if (n % prime == 0)
      {
        System.out.print(prime+",");
        n = n/prime;
      }
      else
      {
        prime++;
      }
    }
  }
}
