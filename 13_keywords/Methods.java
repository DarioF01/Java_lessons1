 public class Methods{
	public void printRoses(){
		String roses = "'Roses are red, violets are blue. Sugar is sweet, and so are you' - William Wallace Denslow";

		System.out.println(roses);
	}
	public void printMrWH(){
		String MrWH = "'Dedication to Mr W.H' by William Shakespear:'TO.THE.BEGETTER.OF.THESE.INSUING.SONNETS.Mr.W.H. ALL.HAPPINESSE.AND.THAT.ETERNITIE.PROMISED.BY.OUR.EVER-LIVING.POET.WISHETH.THE.WELL-WISHING.ADVENTURER.IN.SETING.FORTH.'";

		System.out.println(MrWH);
	}
	public void printComputer(){
		String computer = "'A Grandchild's Guide to Using Grandpa's Computer' by Gene Ziegler:'If a packet hits a pocket on a socket on a port, And the bus is interrupted as a very last resort, And the address of the memory makes your floppy disk abort , Then the socket packet pocket has an error to report!'";

		System.out.println(computer);
	}


	public static void main(String[] args){
		Methods obj = new Methods();
		obj.printRoses();
		obj.printMrWH();
		obj.printComputer();

	}	
}