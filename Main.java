package steganography;

public class Main 
{
  public static void main(String[] args) 
  {
    try
    {
      Embedder emb = new Embedder("this is good", "tk_data.pdf", "f:/Koala.jpg", "f:/qqq.png");
      emb.embed();
      Extractor ext = new Extractor("this is good", "f:/qqq.png", "f:/result");
      ext.extract();
      
    }
    catch(Exception ex)
    {
      System.out.println("Err: " + ex);
    }
  }
}
