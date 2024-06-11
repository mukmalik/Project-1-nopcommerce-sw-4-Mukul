package com.nopcommerce.demo.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader
{

     /*
        Rules for implementing singleton design pattern
        1. Make the constructor private
        2. Create a static method to get the instance
        3. Create a static member variable
        */

    //Declare the PropertyReader variable
    private static volatile PropertyReader propInstance;

    // this method will return instance of PropertyReader class

    public static synchronized PropertyReader getInstance()
    {
        if (propInstance == null)
        {
            propInstance = new PropertyReader();
        }
        return propInstance;
    }

    // this method will read property from property file

    public String getProperty(String propertyName)
    {
        Properties prop = new Properties();
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null)
            {
                return prop.getProperty(propertyName);
            }
        } catch (Exception e)
        {
            System.out.println("Property not found");
        } return  null;
    }

//        public static void main(String[] args)
//        {
//            //System.out.println(System.getProperty("user.dir"));
//            //getInstance().getProperty("browser");
//            System.out.println(getInstance().getProperty("baseUrl"));
//        }

}
