/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.isetjb.config;

import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * PROP Singleton class used for reading properties files.
 *
 * @author Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn)
 */
public class PROP
{
    final static Logger log = Logger.getLogger(PROP.class);

    private static Properties properties;

    /**
     * Private constructor so this class cannot be instantiated only by it self.
     */
    private PROP()
    {
    }

    /**
     * Lazy init for this Singleton Class.
     *
     * @return The Properties object.
     */
    public static Properties getInstance()
    {
        if (properties == null)
        {
            log.debug("Trying to create Properties...");
            try
            {
                properties = new Properties();

                // load  app.properties :
                properties.load(PROP.class.getClassLoader().getResourceAsStream("app.properties"));
                log.debug("Success add app.properties file.");

            } catch (IOException e)
            {
                log.error("Error creating Properties object from properties file : " + e);
                System.exit(0);
            }
        }

        return properties;
    }

    /**
     * Method to get the properties value for a given key.
     *
     * @param key
     * @return The String value.
     */
    public static String getProperty(String key)
    {
        return PROP.getInstance().getProperty(key);
    }

    /**
     * Create the instance for the first time.
     */
    public static void init()
    {
        PROP.getInstance();
    }
}
