#include"stdio.h"
int main()
{
int a[100],b[100],c[100],n,m,i,j;
printf("Enter no. of elements of first array");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("\n");
for(j=0;j<m;j++)
{scanf("%d",&b[j]);
}
for(i=0;i<n;i++)
{ c[i]=a[i];}
for(i=0;i<n;i++)
{for(j=n;j<n+m;j++)
{
if(c[i]==b[j-n])
continue;
else
c[j]=b[j-n];
}}
printf("\n")
for(i=0;i<n+m;i++)
printf("%d",c[i]); }