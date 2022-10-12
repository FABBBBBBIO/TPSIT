package git.fi.itismeucci.chat.client;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClientStr cliente = new ClientStr();
        cliente.connect(); 
        cliente.comunica();
    }
}
