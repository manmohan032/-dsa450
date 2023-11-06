#include<stdio.h>
#include<string.h>
union dat
{
    int i;
    float a;
    char ch[20];
    /* data */
};

int main(int argc, char const *argv[])
{
    union dat data;
    data.a=1.1;
    data.i=10;
    strcpy(data.ch,"lets copy it");
    printf("string in union is : %s\n",data.ch);
    printf("float in union is : %f\n",data.a);
    printf("int in union is : %d\n",data.i);

    return 0;
}
