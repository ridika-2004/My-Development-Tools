#include <stdio.h>
#include <string.h>
#define MAX_INT 10000


void AverageFinder(int array_v[], size_t size_)
{
    int sum_ = 0;
    for(size_t i=0;i < size_;++i)
    {
        array_v[i] = i;
        sum_ += array_v[i];
        printf("%d \n",sum_);
    }
    printf("%d \n",sum_);
    double sum = (double) sum_;
    double size = (double) size_;
    printf("%lf \n",sum/size);
}


void take_info()
{
    int age;
    char name[MAX_INT] = "";
    char address[MAX_INT] = "";
    char email[MAX_INT] = "";

    printf("Enter your name : ");
    gets(name);

    printf("\nEnter your age : ");
    scanf("%d", &age);
    getchar();

    printf("\nEnter your email : ");
    gets(email);

    printf("\nEnter your address : ");
    gets(address);

    printf("\n\nName : %s\n",name);
    printf("Age : %d\n",age);
    printf("Address : %s\n",address);
    printf("Email : %s\n",email);
}


void whats_wrong_1()
{
    char s[MAX_INT] = "";

    printf("Enter a name : ");
    // getchar();
    gets(s);

    strncat(s, " is the best!!", 0);


    printf("\n%s\n",s);

    printf("String size : %d\n",strlen(s));
}


void whats_wrong_2()
{
    char s1[MAX_INT] = "Network";
    char s2[MAX_INT] = " Security";
    char s3[MAX_INT] = "";

    strncat(s3,s1,sizeof(s1));
    strncat(s3,s2,sizeof(s2));

    printf("%s\n",s3);

    strncpy(s1,s3,sizeof(s1));

    printf("%s",s1);
}




int main()
{
    //Task 0 Update the code so that your code follows
    //the first standard, We have discussed.
    size_t size = 10;
    int v[size];
    //Task 1 Update the code so that it calculates the
    //average of the 10 array elements
    //AverageFinder(v, size);

    //Task 2 Update the code so that it scans and prints
    //all the information correctly
    //take_info();

    //Task 3 Update the code so that correct string size
    //gets printed
    //whats_wrong_1();

    //Task 4 Update the code so that unnecessary information
    //does not get printed
    //whats_wrong_2();

    return 0;
}
