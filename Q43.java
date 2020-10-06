import java.util.Scanner;
class OneBhk
{
	private int roomArea;
	private int hallArea;
	private double price; 
	OneBhk()
	{
		roomArea=0;
		hallArea=0;
		price=0.0;
	}
	OneBhk(int roomArea,int hallArea,double price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show()
	{
		System.out.println("RoomArea:"+roomArea+"HallArea:"+hallArea+" Price"+price);
	}
}
class TwoBhk extends OneBhk
{
	private int room
}