
public class Dog extends Animal 
{
	int exerciseTime;
	
	
public Dog(String Name, int exerciseTime)
{
	super(Name);
	exerciseTime = this.exerciseTime;
}	
public void setexercise(int exerciseTime)
{
	this.exerciseTime = exerciseTime;
}
public int exercisetime()
{
	return exerciseTime;
}
public String toString()
{
    return super.toString() + " Exercise time : " + exerciseTime;
}


}	


