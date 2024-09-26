import java.util.Scanner;
class K89{
    int top;
    int stk[]=new int[10];
    K89(){
        top=-1;}
    void push(int item){
        if(stk.length-1==top){
            System.out.println("Stack overflow");}
        else{
            top=top+1;
            stk[top]=item;}}
    void pop(){
       if(top==-1){
           System.out.println("Stack underflow");}
       else{
           int item=stk[top];
           System.out.println("Item popped is:"+item);
           top=top-1;}}
    void display(){
        if(top==-1){
            System.out.println("Stack is empty.No item to display");}
        else{
            System.out.println("Item in the stack are");
            for(int i=top;i>=0;i--){
                System.out.println(stk[i]);}}}}
    
public class  
    
}
    
    

        