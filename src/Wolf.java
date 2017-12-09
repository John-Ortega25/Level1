
public class Wolf {
	private int numTeeth;
	private String name;
	public static Wolf packLeader;
		public Wolf(int teeth, String name){
			this.name= name;
			numTeeth= teeth;
		}
		public void setNumTeeth(int newTeeth){
			if (newTeeth<0) {
				System.out.println("you are crazy");
			}else {
				numTeeth= newTeeth;
			}
			numTeeth= newTeeth;
		}
		public int getNumTeeth(){
			return numTeeth;
		}
		public static void setPackLeader(Wolf newWolfLeader){
			packLeader= newWolfLeader;
		}
		public String getName(){
			return name;
		}
		public String toString(){
			String leaderName;
			if (packLeader== null) {
				leaderName= "none";
			}else {
				leaderName= packLeader.getName();
			}
			return name+ " is a wolf with " + numTeeth + " teeth and a pack leader named " + leaderName + ".";
			
		}
}
