import java.util.*;

import java.io.*;

class HelloWorld {

    public static void main(String[] args) {

        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the number of entries:");

        int n = obj.nextInt();

        int[][] a=new int[10][10];

        int[][] b=new int[10][10];

        int[][] c=new int[10][10];

        int i,j,k ;

        

        for(i=0;i<n;i++)

            for(j=0;j<n;j++)

                {

                System.out.println("Enter the [" + (i)+"]["+(j)+"] element of matrix A :");

                 a[i][j]=obj.nextInt();

                }

        for(i=0;i<n;i++)

            for(j=0;j<n;j++)

                {

                System.out.println("Enter the [" + (i)+"]["+(j)+"] element of matrix B :");

                 b[i][j]=obj.nextInt();

                }

        for(i=0;i<n;i++)

            {

                for(j=0;j<n;j++)

                {

                    c[i][j]=0;

                    for(k=0;k<n;k++)

                    {   

                        c[i][j]=c[i][j]+a[i][k]*b[k][j];

                    }}}

        for(i=0;i<n;i++)

            for(j=0;j<n;j++)

                {

                System.out.println("c [" + (i)+"]["+(j)+"] :"+c[i][j]);

                }

        

    }

}
