package com.company;


/**
 * Java class to use as an example for generating javadoc
 * @author atallavi
 * @since 1.0
 * @version 1.0
 */
public class JavadocExample {

    public static void main(String[] args) {
	// write your code here
    }


    /**
     * Example Javadoc
     * <p>
     * This is a larger description of the method.
     * Method example gets a String and returns true if its equals to Hello World
     * @param text text we want to return
     * @return true if the text passed was equals to Hello World
     * @throws Exception NullPointerException if the parameter is null
     * @see NullPointerException
     */
    public Boolean exampleMethod(String text) throws Exception{
        if (text == null){
            throw new NullPointerException();
        }
        return text.equals("Hello World");
    }
}
