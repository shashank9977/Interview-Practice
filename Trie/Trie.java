package Trie;

import java.util.HashMap;
import java.util.Scanner;

 class Trie{
	private TrieNode root;
	public Trie()
	{ 
		root= new TrieNode((char)0);
	
	}
	
	public void insert(String word){
		
		TrieNode crawl=root;
		int length=word.length();
		
		for(int level=0;level<length;level++){
			
				char ch=word.charAt(level);
				HashMap<Character,TrieNode> children=crawl.getChildren();	
				if(children.containsKey(ch)){
					
					crawl= children.get(ch);					
				}
				else
				{
					TrieNode temp=new TrieNode(ch);
					children.put(ch, temp);
					crawl=temp;
				}			
		}
		
		crawl.setIsEnd(true);	
	}
	
	public String getMatchingPrefix(String input){
		
		String result="";	
		int length=input.length();	
		TrieNode crawl=root;
		int prevMatch=0;
		
		for(int level=0;level<length;level++){
			
			char ch=input.charAt(level);
			HashMap<Character,TrieNode> child=crawl.getChildren();	
			if(child.containsKey(ch))
			{				
				result+=ch;
				crawl=child.get(ch);
				
				 // If this is end of a word in the crawl, then update prevMatch
	            if( crawl.bIsEnd)
	                    prevMatch = level + 1;
	            }
	            else  break;
	        }
	 
	        // If the last processed character did not match end of a word,
	        // return the previously matching prefix
	        if( !crawl.bIsEnd )
	                return result.substring(0, prevMatch);        
	 
	        else return result;
					
			}
	
	
	public static void main(String[] args){
		
		 Trie dict = new Trie();
		 
		 Scanner sc=new Scanner(System.in);
	        dict.insert("are");
	        dict.insert("area");
	        dict.insert("base");
	        dict.insert("cat");
	        dict.insert("cater");
	        dict.insert("basement");
	 
	        String input = "caterer";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));              
	 
	        input = "basement";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));                      
	 
	        input = "are";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));              
	 
	        input = "arex";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));              
	 
	        input = "basemexz";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));                      
	 
	        input = "xyz";
	        System.out.print(input + ":   ");
	        System.out.println(dict.getMatchingPrefix(input));	
			
			}
		
		}
