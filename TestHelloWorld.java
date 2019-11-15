import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestHelloWorld {

   private HelloWorld h;

   @Before
   public void setUp() throws Exception
   {
      h = new HelloWorld();
   }

   @Test
   public void testHelloEmpty()
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }

   @Test
   public void testHelloWorld()
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}