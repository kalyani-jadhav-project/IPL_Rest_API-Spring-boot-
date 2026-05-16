package com.kalyani;

public class iplteam {
	String teamname;
	int trophies;
	String ownername;
	String Captain_name;
	public iplteam(String teamname, int trophies, String ownername, String captain_name) {
		super();
		this.teamname = teamname;
		this.trophies = trophies;
		this.ownername = ownername;
		Captain_name = captain_name;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCaptain_name() {
		return Captain_name;
	}
	public void setCaptain_name(String captain_name) {
		Captain_name = captain_name;
	}
	public iplteam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "iplteam [teamname=" + teamname + ", trophies=" + trophies + ", ownername=" + ownername
				+ ", Captain_name=" + Captain_name + "]";
	}

}
