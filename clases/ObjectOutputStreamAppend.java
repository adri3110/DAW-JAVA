
package clases;

import java.io.*;

public class ObjectOutputStreamAppend extends ObjectOutputStream{
   public ObjectOutputStreamAppend(OutputStream out) throws IOException{
       super(out);
       
   }
   @Override
   protected void writeStreamHeader()
   {
       
   }
   
}
