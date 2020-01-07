import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    System.out.println(flipNHeads(6));
    clock();
   
  }

  //Create a pluralize function
  public static String pluralize(String word, int num){

    if(num >= 2 || num == 0){
      return word + "s";
    } else {
      return word;
    }
      
  }

  //Create a flipNHeads function
  public static String flipNHeads(int num){

    String counter = num > 1 ? "heads" : "head";
    
    int flips = 0;
    int heads = 0;

    //flipping the coin
    while(heads < num){
      double flip = Math.random();
      flips++;
      if(flip <= 0.5){
        System.out.println("tails");
        heads = 0;
      } else {
        heads++;
        System.out.println("heads");
      }

    } 
    return "It took " + flips + " flips to flip " + heads +  " " + counter + " in a row";
  }


  //Create a clock function
  public static void clock(){

    int pastSec = 2;
    while(true){
      LocalDateTime now = LocalDateTime.now();

      //getting the seconds
      int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

      if(pastSec != second){
        System.out.println(time);
        pastSec = second;
      }
    }

  }


  
}

