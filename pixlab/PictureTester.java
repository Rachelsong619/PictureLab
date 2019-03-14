/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testCopy()
  {
      Picture ocean = new Picture("beach.jpg");
      Picture daddy = new Picture("flower1.jpg");
      ocean.copy(daddy, 50, 300);
      ocean.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture ("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  public static void testNegate()
  {
     Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.negate();
    temple.explore();
  }
  
  public static void testGrayScale()
  {
     Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.grayScale();
    temple.explore();
  }
    
    
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
  }
  
  public static void testMirrorGull()
  {
      Picture seagull = new Picture("seagull.jpg");
      seagull.explore();
      seagull.mirrorGull();
      seagull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayScale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
