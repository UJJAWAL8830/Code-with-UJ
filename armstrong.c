                    /*
                    NOTE:- On the line 41 we have use pow() function which is malfunctioning on my vs code
                            only for number 5 means that in my terminal i got 5 cubes 124 instead of 125 ,
                            therefore if we have to check that 153 is an armstrong number or not it will show you 
                            that 153 is not an armstrong number because at run time it would gives 5 cube 124 , i got
                            to know about this problem during debugging , if you still want to check that code is right you can run it on online c compiler 

                            *Also note that the comment part is just use for debugging purpose so you dont have to addn to your code . Happy Coding!😊 
                    
                     */


#include <stdio.h>
#include<math.h>

int armstrong(int);

int armstrong(int n) {
    int digit = 0;
    
    while(n != 0) {
        n /= 10;
        digit++;
    }

    return digit;
}

int main() {
    
    int n , original_number;

    printf("Please write the number that you want to check that it is armstrong number or not:- ");
    scanf("%d" , &n);

    original_number = n;
    int sum = 0;
    int digit = armstrong(n);

    //printf("digits %d \n", digit);

    for(int i = 1 ; i <= digit ; i++) {

            int rem  = original_number % 10;
            int pow_value = (int) pow(rem , digit);
            //printf("%d , %d , %d\n" , rem, pow_value , digit);      
            original_number /= 10;   
            sum += pow_value;
            //printf("sum %d = %d\n" , i , sum); 
    }



    printf("The sum as per the armstrong number concept is %d", sum);

    if(sum == n ) {
        printf("\n%d is an armstrong number", n);
    }
    else {
        printf("\n%d is not an armstrong number", n);
            }

    return 0;
}