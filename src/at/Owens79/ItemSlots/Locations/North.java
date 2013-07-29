package at.Owens79.ItemSlots.Locations;

import org.bukkit.Location;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class North extends Local{

	//Lamp Based
	private Location lmp_Lev; //Lever
	private Location lmp_Sgn; //Sign

	//Lever Based
	private Location lev_Drp; //Dispenser
	private Location lev_Sgn; //Sign
	private Location lev_Lmp;//Lamp
	
	//Dropper Base
	private Location drp_Lev;//Lamp
	private Location drp_Sgn;//Sign
	
	//Sign Based
	private Location sgn_Lmp;//Lamp
	private Location sgn_Lev;//Lever
	private Location sgn_Drp;//Dropper

	public North(BlockPlaceEvent event) {

		super(event);

	}

	North (PlayerInteractEvent event){

		
	}
	
	public North(SignChangeEvent event) {
		
		super(event);
	}

	// X = +Left -Right
	// Y = +Up -Down
	// Z = +Forward -Back

	//Lamp Base
	public void setLmpLev() {this.lmp_Lev = new Location(world, -1, 0, -1);}

	public void setLmpSgn() {this.lmp_Sgn = new Location(world, 0, 1, -1);}
	
	public Location getLmpLev() {return this.lmp_Lev;}

	public Location getLmpSgn() {return this.lmp_Sgn;}
	
	public void setMacLamp() {
		
		this.setLmpLev();
		this.setLmpDrp();
		this.setLmpSgn();
	}

	// X = +Left -Right
	// Y = +Up -Down
	// Z = +Forward -Back
	
	//Lever Base
	public void setLevLmp() { this.lev_Lmp = new Location(world, 1, 0, 1); }

	public void setLevSgn() { this.lev_Sgn = new Location(world, 1, 1, 0); }

	public void setLevDrp() { this.lev_Drp = new Location(world, 1, -1, 1); }

	public Location getLevLmp() { return this.lev_Lmp; }

	public Location getLevSgn() { return this.lev_Sgn; }

	public Location getLevDrp() { return this.lev_Drp; }
	
	public void setMacLever() {
		
		this.setLevLmp();
		this.setLevSgn();
		this.setLevDrp();
	}
	
	// X = +Left -Right
	// Y = +Up -Down
	// Z = +Forward -Back
	
	//Dropper Base
	public void setDrpSgn(){this.drp_Sgn = new Location(world, 0, 2, -1); }
	
	public void setDrpLev(){this.drp_Lev = new Location(world, -1, 1, -1); }
	
	public Location getDrpSgn() {return this.drp_Sgn;}
	
	public Location getDrpLev() {return this.drp_Lev;}
	
	public void setMacDropper() {
		
		this.setDrpLev();
		this.setDrpLmp();
		this.setDrpSgn();
	}
	
	// X = +Left -Right
	// Y = +Up -Down
	// Z = +Forward -Back
	
	//Sign Base
	public void setSgnLmp() {this.sgn_Lmp = new Location(world, 0, -1, 1);}
	
	public void setSgnLev() {this.sgn_Lev = new Location(world, -1, -1, 0);}
	
	public void setSgnDrp() {this.sgn_Drp = new Location(world, 0, -2, 1);}
	
	public Location getSgnLmp() {return this.sgn_Lmp;}
	
	public Location getSgnLev() {return this.sgn_Lev;}
	
	public Location getSgnDrp() {return this.sgn_Drp;}
	
	public void setMacSign(){
		
		this.setSgnLmp();
		this.setSgnLev();
		this.setSgnDrp();
	}

}//North Class
