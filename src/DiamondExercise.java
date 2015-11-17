public class DiamondExercise
{
  public static void main(String args[])
  {
    isoscelesTriangle(5);
    diamond(5);
    diamondWithName(5);
  }
  public static void isoscelesTriangle(int n)
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
       System.out.print(" ");
      }
      for(int k=1;k<=2*i-1;k++)
      {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }

  public static void diamond(int n)
  {
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<(i+1)*2-1;k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      }
      for(int j=i;j<2*n-i-1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void diamondWithName(int n)
  {
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<(i+1)*2-1;k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=0;i<n;i++)
    {
      if (i == 0)
      {
        System.out.println("XUXIAOJUAN");
      }
      else{
        for(int j=0;j<i;j++)
        {
          System.out.print(" ");
        }
        for(int j=i;j<2*n-i-1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
