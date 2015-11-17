public class TriangleExercise
{
  public static void main(String[] args)
  {
    System.out.println("*\n");
    drawHorizontal(8);
    drawVertical(3);
    drawRightTriangle(5);
  }

  public static void drawHorizontal(int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.print("*");
    }
    System.out.println("\n");
  }

  public static void drawVertical(int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.println("*");
    }
    System.out.println("\n");
  }

  public static void drawRightTriangle(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print("*");
      }
      System.out.println("*");
    }
    System.out.println("\n");
  }
}
