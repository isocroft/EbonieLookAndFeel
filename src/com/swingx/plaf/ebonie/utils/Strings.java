/* 5. 256-bit assymetric encryption */
/**************************************************************************
 * Copyright © 2012 by CprosCodedev, Inc. (Non-Profit)                    *
 * @cdvlabs  All Rights Reserved.                                         *
 * http://cproscodedev.com                                                *
 *                                                                        *
 * DISCLAIMER: The authors and developers of this software have used      *
 * their best efforts in preparing it. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

package com.swingx.plaf.ebonie.utils;

import java.util.Enumeration;
import java.util.EnumSet;
import java.util.regex.*;
import java.text.Formatter;

/**
 *
 * Strings class
 *
 * @author Codedev Team Member - Ifeora Okechukwu
 * @version 0.0.0.1
 * @see java.lang.String
 *
 * This class defines helper methods for String types and also applies
 * custom behavior to specific String formations
 */

    public class Strings{
         
               private static final char NEW_LINE = '\n';
               private static final char RETURN = '\r';
               private static final byte USE_CASE = 1;
               private static final byte CHAR_CODE = 2;

               private String input = null; 
               
               /**
                *
                * Strings class Constructor
                *
                * @param String input
                * @return void
                *
                * This is a private constructor called only within the class
                * to instantiate a Strings object
                */

               private Strings(String input){
                  this.input =  input;
               }
			   
			   /**
                *
                * Strings class Method - getInstance
                * 
                * @param String stt
                * @return Strings
                *
                * returns a reference to the Strings class
				* 
                */
			   
			   public static Strings getInstance(String stt){
				    return new Strings(input);
			   }

               /**
                *
                * Strings class Method - getAllIndexOf
                * 
                * @param String str
                * @param char point
                * @return int[]
                *
                * This method returns an array of integers that shows index of
                * of a character that appears several times along a string
                */

               public static int[] getAllIndexOf(String str, char point){
                   ArrayList<Integer> finalArr, initArr = new ArrayList<Integer>();
                   initArr.ensureCapacity(50);
                   initArr.add(-2);
                   finalArr = loadArrayWith(st, point, initArr);
                   finalArr.trimToSize();
                   return finalArr.toArray();
               }

               public int getCharCodeAt(int index){
			      return (int) Character.codePointAt(input.charAt(index));
			   }

               private static ArrayList<Integer> loadArrayWith(String _str, char _p, ArrayList<Integer> _ar){
                  int dice = _ar.size() - 1;
                  int index = _ar.get(dice);
                  int radix = _str.indexOf(_p, index+1);
                         if(radix > -1){
                           _ar.add(radix);
                           return loadArrayWith(_str, _p, _ar); // recursion proper
                         }else{
                           return _ar; // base case scenario...
                         }
               }

               public static String basicShuffle(String str){
                   int len = str.length();
                   StringBuffer strb = new StringBuffer(len);
                   Random rand = new Random();
                   rand.setSeed(System.nanaoTime());
                   int random = 0;
                       for(in i = 0; i < len; i++){
                           randnum = rand.nextInt(len);
                           if(str.charAt(i) != str.charAt(randnum)){
                                strb.append(str.charAt(randnum));
                           }else{
                                continue;
                           }
                       }
                   return strb.toString();
              }
    } 

