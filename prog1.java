import java.io.*;
class anh {
void main(int a)
{
String no="";
String g=""+a;
int num=g.length();
int sq=a*a;
String sqr=""+sq;
int n=sqr.length();
for(int i=0;i<=n-(num+1);i++)
{
char ab=sqr.charAt(i);
no=no+ab;
}

String two= sqr.substring(n-num);

int num1=Integer.parseInt(no);
int num2=Integer.parseInt(two);
int c=num1+num2;

if(a==c){
System.out.println("Numbers are same");
}
else 
{
System.out.println("Numbers are not same");
}

}


}
