import java.io.*; 
class Q54 { 
    public static void main(String[] args) 
    { 
        String s = "This is a string"; 
        StringBuilder s1 = new StringBuilder(); 
        s1.append(s); 
        s1 = s1.reverse();  
        System.out.println(s1); 
    } 
} 