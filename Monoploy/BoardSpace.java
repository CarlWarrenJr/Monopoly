package Monoploy;

public class BoardSpace {
	public String[] squares = new String[40];
	public Player player=new Player();
	public void spacesSetUp() {
		
		for (int i = 0; i < squares.length; i++) {
			switch(player.space) {
			case(1):
				squares[i]="GO";
			case(2):
				squares[i]="MEDITERRANEAN AVENUE";
			case(3):
				squares[i]="COMMUNITY CHEST";
			case(4):
				squares[i]="BALTIC AVENUE";
			case(5):
				squares[i]="INCOME TAX";
			case(6):
				squares[i]="READING RAILROAD";
			case(7):
				squares[i]="ORIENTAL AVENUE";
			case(8):
				squares[i]="CHANCE";
			case(9):
				squares[i]="VERMONT AVENUE";
			case(10):
				squares[i]="CONNETICUT AVENUE";
			case(11):
				squares[i]="JAIL/ JUST VISITING";
			case(12):
				squares[i]="ST. CHARLES PLACE";
			case(13):
				squares[i]="ELECTRIC COMPANY";
			case(14):
				squares[i]="STATES AVENUE";
			case(15):
				squares[i]="VIRGINIA AVENUE";
			case(16):
				squares[i]="PENNSYLVANIA RAILROAD";
			case(17):
				squares[i]="ST. JAMES PLACE";
			case(18):
				squares[i]="COMMUNITY CHEST";
			case(19):
				squares[i]="TENNESEE AVENUE";
			case(20):
				squares[i]="NEW YORK AVENUE";
			case(21):
				squares[i]="FREE PARKING";
			case(22):
				squares[i]="KENTUKY AVENUE";
			case(23):
				squares[i]="CHANCE";
			case(24):
				squares[i]="INDIANA AVENUE";
			case(25):
				squares[i]="ILLINOIS AVENUE";
			case(26):
				squares[i]="B&O RAILROAD";
			case(27):
				squares[i]="ATLANTIC AVENUE";
			case(28):
				squares[i]="VENTOR AVENUE";
			case(29):
				squares[i]="WATER WORKS";
			case(30):
				squares[i]="MARVIN GARDENS";
			case(31):
				squares[i]="GO TO JAIL";
			case(32):
				squares[i]="PACIFIC AVENUE";
			case(33):
				squares[i]="NORTH CAROLINA AVENUE";
			case(34):
				squares[i]="COMMUNITY CHEST";
			case(35):
				squares[i]="PENNSYLVANIA AVENUE";
			case(36):
				squares[i]="SHORT LINE";
			case(37):
				squares[i]="CHANCE";
			case(38):
				squares[i]="PARK PLACE";
			case(39):
				squares[i]="LUXUARY TAX";
			case(40):
				squares[i]="BOARDWALK";
			}
			player.space++;
		}
		
	}
	public void individualSpace() {
		
	}
}