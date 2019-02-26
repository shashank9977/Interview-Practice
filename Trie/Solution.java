package Trie;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class TrieNode{
    
    private char ch;
    private HashMap<Character, TrieNode> children=new HashMap<Character,TrieNode>();
    boolean isEnd;
    private int count=0;
    public TrieNode(char ch, int count){
             this.ch=ch;
             this.children=new HashMap<Character,TrieNode>();
             this.isEnd=true;
             this.count=count; 
    }  
    public HashMap<Character, TrieNode> getChildren(){       
        return this.children;        
    }  
    public char getValue(){     
        return this.ch;     
    } 
    public int getCount()
     {
        
        return this.count;
        
     }
    
    public void setCount(int count){
        
        this.count=count;
        
    }
      
}
 
 class Trie{
    
    private static TrieNode root;   
    public Trie(){
        root=new TrieNode((char)0,0);     
    }
    
    public void add(String word){
        
        int length=word.length();
        TrieNode crawl=root;
        int count=0;
        //int lastmax=0;
 for(int level=0;level<length;level++)
        {         	
          char ch=word.charAt(level);        
          HashMap<Character,TrieNode> child=crawl.getChildren();
            
          if(child.containsKey(ch)){
                    
                crawl=child.get(ch);               
                count=crawl.getCount();
                count=count+1;
                crawl.setCount(count);
            }
            else {
                     TrieNode temp=new TrieNode(ch,1);
                     child.put(ch,temp);
                     crawl=temp;          
               }           
        }
        
       crawl.isEnd=true;
    }
    
    public  int find(String input){
        
         //String result="";
        // int prevmax=0;
         int lastmax=0;
         int count=0;
         int len=input.length();
         TrieNode crawl=root; 
        
        for(int level=0;level<len;level++){                       
            char ch=input.charAt(level);
             HashMap<Character,TrieNode> child=crawl.getChildren();                          
             if(child.containsKey(ch)){
                 
                 crawl=child.get(ch);
                 lastmax=crawl.getCount();
                 
                }            
            else{
                
              return 0;
              
            }
        }       
        return lastmax;
    }
}
  

public class Solution {

    public static void main(String[] args) 
    {
    	 Trie dict = new Trie();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {            
           String str=sc.next();
           if(str.equals("add")){
        	   
               dict.add(sc.next());         
           }
            else
            {
               System.out.println(dict.find(sc.next()));
               
            }         
        }
        sc.close();
    }
}
