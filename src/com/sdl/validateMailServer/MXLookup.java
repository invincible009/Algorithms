package com.sdl.validateMailServer;


import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

/**
 * The best you can do to verify if an email address is real is to verify
 * if there is a mail server registered to the domain name.
 */
public class MXLookup {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Usage: MXLookup host [.....]");
            System.exit(99);
        }


        for( int i = 0; i < args.length; i++ ) {
            try {
                System.out.println( args[i] + " has " +
                        doLookups( args[i] ) + " mail servers" );
            }
            catch( Exception e ) {
                System.out.println(args[i] + " : " + e.getMessage());
            }
        }
    }

    private static int doLookups(String hostName) throws NamingException {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial",
                "com.sun.jndi.dns.DnsContextFactory");
        DirContext ictx = new InitialDirContext( env );
        Attributes attrs =
                ictx.getAttributes( hostName, new String[] { "MX" });
        Attribute attr = attrs.get( "MX" );
        if( attr == null ) return( 0 );
        return( attr.size() );
    }
}
