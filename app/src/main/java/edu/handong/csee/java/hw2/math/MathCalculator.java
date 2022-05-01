package edu.handong.csee.java.hw2.math;
/**
 *      this is MathCalculator class for my program
 */

public class MathCalculator {
    private String name;
/**
 * this is getName method
 * @return this return name of string type
 */
    public String getName() {
        return name;
    }
/**   
 * this is setName method
 * @param arg this is string type of paramaters
 */
    public void setName(String arg) {
        name = arg;
    }
/**
 * this is getMax method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return max
 */

    public int getMax(int a,int b){
        if(a>b) return a;
        else return b;
    }
/**
 * this is getMin method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return min value
 */
    public int getMin(int a,int b){
        if(a<b) return a;
        else return b;
    }
/**
 * this is getAbs method
 * @param a this is int type of paramaters
 * @return this return abs value
 */
    public int getAbs(int a){
        if(a<0) return(a*(-1));
        else return a;
    }
/**
 * this is getSum method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return sum value
 */
    public int getSum(int a,int b){
        return (a+b);
    }
/**
 * this is getDiff method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return diff value
 */
    public int getDiff(int a, int b){
        return (a-b);
    }
/**
 * this is getProduct method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return product value
 */
    public int getProduct(int a,int b){
        return(a*b);
    }
/**
 * this is getQuotient method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return quotient value
 */
    public int getQuotient(int a,int b){
        return (a/b);
    }
/**
 * this is getRemainder method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return remainder value
 */
    public int getRemainder(int a,int b){
        return(a%b);
    }
/**
 * this is getPower method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return power value
 */
    public int getPower(int a,int b){
        int num=1;
        for(int i=0;i<b;i++){
            num=num*a;
        }
        return (num);
    }
/**
 * this is getFactorial mathod
 * @param a this is int type of paramaters
 * @return this return factorial value
 */
    public int getFactorial(int a){
        int num=1;
        for(int i=a;i>0;i--){
            num=num*i;
        }
        return (num);
    }
/**
 * this is getGcd method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return gcd value
 */
    public int getGcd(int a,int b){
        int min,gcd=0;
        if(a<b) min=a;
        else min=b;

        for(int i=1;i<=min;i++){
            if (a%i==0&&b%i==0) 
                gcd=i;
        }
        return (gcd);
    }
/**
 * this is getLcm method
 * @param a this is int type of paramaters
 * @param b this is int type of paramaters
 * @return this return lcm value
 */
    public int getLcm(int a,int b){
        return a*b/getGcd(a, b);
    }
/**
 * this is getSquare method
 * @param a this is int type of paramaters
 * @return this return square value
 */
    public int getSquare(int a){
        return (a*a);
    }
}

