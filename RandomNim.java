//Tingxuan Huang
public class RandomNim
{
  int number = 0;
  int take = 0;
  //initialize variables
  public RandomNim (int startnum) 
  {
    number = startnum;//sets the number to the starting amount of pieces
  }
  
  // In order to win, must leave opponent with a number that is 1 + a multiple of 3
  public int play (int pieces)
  {
    number = pieces;// sets the number to the current amount of pieces
  if (number % 3 == 0)
  {
    take = 2;//takes two if the remainder is 0 since it is a multiple of 3
  }
  else if (number % 3 == 2)
  {
    take = 1;//takes one if the remainder is 2 since it is 2 + a multiple of 3
  }
  else 
  {
    if (Math.random() <= .5) // if the remainder is 1, you would likely lose, so it just picks a random number to take
    {
      take = 1;
    }  
    else 
    {
      take = 2;
    }
    
  
  }
  return take; // returns the number of pieces to take
}
}