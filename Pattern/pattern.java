/*
1
1 2
1 2 3
2 1
1
*/

import java.util.*;
class Main {
  public static void main(String[] args) {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no.of rows:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
  int count=1;
    for(j=1;j<=i;j++)
    {
      System.out.print(count);
      count++;
    }
    System.out.println(" ");
    }
    for(i=1;i<=n;i++)
    {
      for(j=n-i;j>=1;j--)
      {
        System.out.print(j);
      }
      System.out.println(" ");
    }
  }
}
