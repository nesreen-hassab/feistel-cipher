/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feistel_cipher;

/**
 *
 * @author nesreen
 */
public class Feistel_cipher {

    /**
     * @param args the command line arguments
     */
    
   
     public static String encript_or_function(String plaintext ,String key,int round)
    {
        String cipher ;
        String left =plaintext.substring( 0,plaintext.length()/2);
        String right=plaintext.substring( plaintext.length()/2,plaintext.length());
        
        String []k = new String[round];
        k[0] = key.substring(0, key.length()/2);
        k[1] = key.substring(key.length()/2,key.length());
        
        int c=round;
        StringBuilder or = new StringBuilder();
        String f_or;
        for (int j=0; j<round ;j++)
        {
            for(int i=0 ; i<right.length();i++ )
            {
                if(right.charAt(i)=='0' && k[round-c].charAt(i)=='0')
                {
                   or.append('0');
                }
                else or.append('1');
            }

            f_or= or.toString();
            
            or.delete(0,right.length());
            
          
            for(int i=0 ; i<left.length() ;i++)
                {
                    if(left.charAt(i)==f_or.charAt(i))
                    {
                        or.append('0');
                    }
                    else or.append('1');
                }
               String f_r_new =or.toString();
               or.delete(0,left.length());
               left=right;
               right=f_r_new;
               c-=1;
        }
        String temp;
        temp=right;
        right=left;
        left=temp;
        cipher=left+right;
        
        return cipher;
    }  
    

public static String encript_and_function(String plaintext ,String key,int round)
    {
        String cipher ;
        String left =plaintext.substring( 0,plaintext.length()/2);
        String right=plaintext.substring( plaintext.length()/2,plaintext.length());
        
        String []k = new String[round];
        k[0] = key.substring(0, key.length()/2);
        k[1] = key.substring(key.length()/2,key.length());
        
        int c=round;
        StringBuilder and = new StringBuilder();
        String f_and;
        for (int j=0; j<round ;j++)
        {
            for(int i=0 ; i<right.length();i++ )
            {
                if(right.charAt(i)=='1' && k[round-c].charAt(i)=='1')
                {
                   and.append('1');
                }
                else and.append('0');
            }

            f_and= and.toString();
            
            and.delete(0,right.length());
            
          
            for(int i=0 ; i<left.length() ;i++)
                {
                    if(left.charAt(i)==f_and.charAt(i))
                    {
                        and.append('0');
                    }
                    else and.append('1');
                }
               String f_r_new =and.toString();
               and.delete(0,left.length());
               left=right;
               right=f_r_new;
               c-=1;
            }
        String temp;
        temp=right;
        right=left;
        left=temp;
        cipher=left+right;
        
        return cipher;
    }  







 public static String decript_or_function(String cipher ,String key,int round)
    {
        String plaintext ;
        String left =cipher.substring( 0,cipher.length()/2);
        String right=cipher.substring( cipher.length()/2,cipher.length());
        
        String []k = new String[round];
        k[0] = key.substring(0, key.length()/2);
        k[1] = key.substring(key.length()/2,key.length());
        
        int c=1;
        StringBuilder or = new StringBuilder();
        String f_or;
        for (int j=0; j<round ;j++)
        {
            for(int i=0 ; i<right.length();i++ )
            {
                if(right.charAt(i)=='0' && k[round-c].charAt(i)=='0')
                {
                   or.append('0');
                }
                else or.append('1');
            }

            f_or= or.toString();
            
            or.delete(0,right.length());
            
          
            for(int i=0 ; i<left.length() ;i++)
                {
                    if(left.charAt(i)==f_or.charAt(i))
                    {
                        or.append('0');
                    }
                    else or.append('1');
                }
               String f_r_new =or.toString();
               or.delete(0,left.length());
               left=right;
               right=f_r_new;
               c+=1;
        }
        String temp;
        temp=right;
        right=left;
        left=temp;
        plaintext=left+right;
        
        return plaintext;
    }  
    
 
 public static String decript_and_function(String cipher ,String key,int round)
    {
        String plaintext ;
        String left =cipher.substring( 0,cipher.length()/2);
        String right=cipher.substring( cipher.length()/2,cipher.length());
        
        String []k = new String[round];
        k[0] = key.substring(0, key.length()/2);
        k[1] = key.substring(key.length()/2,key.length());
        
        int c=1;
        StringBuilder or = new StringBuilder();
        String f_or;
        for (int j=0; j<round ;j++)
        {
            for(int i=0 ; i<right.length();i++ )
            {
                if(right.charAt(i)=='1' && k[round-c].charAt(i)=='1')
                {
                   or.append('1');
                }
                else or.append('0');
            }

            f_or= or.toString();
            
            or.delete(0,right.length());
            
          
            for(int i=0 ; i<left.length() ;i++)
                {
                    if(left.charAt(i)==f_or.charAt(i))
                    {
                        or.append('0');
                    }
                    else or.append('1');
                }
               String f_r_new =or.toString();
               or.delete(0,left.length());
               left=right;
               right=f_r_new;
               c+=1;
        }
        String temp;
        temp=right;
        right=left;
        left=temp;
        plaintext=left+right;
        
        return plaintext;
    }  
    
    
}
